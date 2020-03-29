package com.book.store.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map和Bean的相互转换
 */
public class BeanMapUtil {
	
	public static final String module = BeanMapUtil.class.getName();
	
	@SuppressWarnings("unchecked")
	public static Map<String, Object> beanToMap(Object obj) throws Exception {
		if (null == obj) {
			return null;
		}
		// 取前2位com.xxx,比如:南京银行就是com.itfin
		String objClassNamePrefix = obj.getClass().getName();
		int firstPointIndex = objClassNamePrefix.indexOf(".");
		if(firstPointIndex > 0) {
			int secondPointIndex = objClassNamePrefix.indexOf('.', firstPointIndex + 1);
			if(secondPointIndex > 0) {
				objClassNamePrefix = objClassNamePrefix.substring(0, secondPointIndex);
			} else {
				objClassNamePrefix = objClassNamePrefix.substring(0, firstPointIndex);
			}
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		//Field[] fields = obj.getClass().getDeclaredFields();
		List<Field> listField = new ArrayList<Field>();
		listField = getBeanFields(obj.getClass(), listField);
		try {
			for (Field field : listField) {
				field.setAccessible(true);
				if (null == field.get(obj)) {
					continue;
				}
				if (field.getType().getName().equals("java.util.List")) {
					List<Object> sourceList = (List<Object>) field.get(obj);
					List<Object> targetList = new ArrayList<Object>();
					for (int i = 0; i < sourceList.size(); i++) {
						if (null != sourceList.get(i)
								&& sourceList.get(i).getClass().getName().startsWith(objClassNamePrefix)) {
							targetList.add(beanToMap(sourceList.get(i)));
						} else {
							targetList.add(sourceList.get(i));
						}
					}
					map.put(field.getName(), targetList);
				} else if(field.getType().getName().startsWith(objClassNamePrefix)){
					map.put(field.getName(), beanToMap(field.get(obj)));
				} else {
					map.put(field.getName(), field.get(obj));
				}
			}
		} catch (IllegalArgumentException e) {
			String errMsg = "不合法的参数." + e.getMessage();
			throw new Exception(errMsg, e);
		} catch (IllegalAccessException e) {
			String errMsg = "不合法的访问." + e.getMessage();
			throw new Exception(errMsg, e);
		} catch (Exception e) {
			throw e;
		}

		return map;
	}
	
	@SuppressWarnings("unchecked")
	private static <T> List<Field> getBeanFields(Class<T> clz, List<Field> fs) {
		Field[] fields = clz.getDeclaredFields();
		for(int i = 0; i <fields.length; i++) {
			// 修饰符不是final,static,strict严格,volatile不稳定的,transient短暂的,synchronized同步
			int mod = fields[i].getModifiers();
			if(!Modifier.isFinal(mod) && !Modifier.isStatic(mod)) {
//					&& !Modifier.isStrict(mod) && !Modifier.isVolatile(mod) 
//					&& !Modifier.isTransient(mod) && !Modifier.isSynchronized(mod)) {
				fs.add(fields[i]);
			}
		}
		
		if(null != clz.getSuperclass()) {
			Class<T> clsSup = (Class<T>) clz.getSuperclass();
			fs = getBeanFields(clsSup, fs);
		}
		
		return fs;
	}

	@SuppressWarnings("unchecked")
	public static <T> T mapToBean(Map<String, Object> map, Class<T> obj) throws Exception {
		if (map == null || obj == null) {
			return null;
		}
		
		// 取前2位com.xxx,比如:南京银行就是com.itfin
		String objClassNamePrefix = obj.getName();
		int firstPointIndex = objClassNamePrefix.indexOf(".");
		if (firstPointIndex > 0) {
			int secondPointIndex = objClassNamePrefix.indexOf('.', firstPointIndex + 1);
			if (secondPointIndex > 0) {
				objClassNamePrefix = objClassNamePrefix.substring(0, secondPointIndex);
			} else {
				objClassNamePrefix = objClassNamePrefix.substring(0, firstPointIndex);
			}
		}
				
		Set<Entry<String, Object>> sets = map.entrySet();
		T t = null;

		// -----方便定位问题---------
		// 字段名
		String fieldName = "";
		// 字段值
		Object fieldValue = "";
		// 实际类型
		String actualType = "";
		// 期望类型
		String expectType = "";
		try {
			t = obj.newInstance();

			Method[] methods = obj.getMethods();//.getDeclaredMethods();
			for (Entry<String, Object> entry : sets) {
				String str = entry.getKey();
				
				fieldName = str;
				fieldValue = entry.getValue();
				if (fieldValue == null) {
					actualType = null;
				} else {
					actualType = fieldValue.getClass().toString();
				}
				
				String setMethod = "set" + str.substring(0, 1).toUpperCase() + str.substring(1);

				for (Method method : methods) {
					if (method.getName().equals(setMethod)) {
						for (int i = 0; i < method.getParameters().length; i++) {
							String className = method.getParameters()[i].getParameterizedType().getTypeName();
							
							expectType = className;
							
							if (className.startsWith("java.util.List<")) {
								String innerClassName = className.substring("java.util.List".length() + 1,
										className.length() - 1);
								if(innerClassName.startsWith(objClassNamePrefix)){
										Class<?> clazz = Class.forName(innerClassName);

									List<Object> sourceList = (List<Object>) entry.getValue();
									if (sourceList != null) {
									List<Object> targetList = new ArrayList<Object>();
									for (int j = 0; j < sourceList.size(); j++) {
										targetList.add(mapToBean((Map<String, Object>) sourceList.get(j), clazz));
									}
									method.invoke(t, targetList);
									}
								} else if (className.startsWith("java.util.Date")) {
									if(entry.getValue() != null) {
										method.invoke(t, StringUtil.formatDateStr(entry.getValue().toString()));
									}								
								} else{
									method.invoke(t, entry.getValue());
								}	
							}else if(className.startsWith("com.bosent.base.util.RequestHeader")){
								method.invoke(t, entry.getValue());
							}else if (className.startsWith(objClassNamePrefix)) {
								method.invoke(t, mapToBean((Map<String, Object>)entry.getValue(), Class.forName(className)));
							}else if (className.startsWith("java.util.Date")) {
								if(entry.getValue() != null) {
									method.invoke(t, StringUtil.formatDateStr(entry.getValue().toString()));
								}								
							} else {
								method.invoke(t, entry.getValue());
							}
						}
						break;
					}
				}
			}
		} catch (ClassNotFoundException e) {
			String errMsg = "找不到类." + e.getMessage();
			throw new Exception(errMsg, e);
		} catch (InstantiationException e) {
			String errMsg = "无法实例化." + e.getMessage();
			throw new Exception(errMsg, e);
		} catch (IllegalAccessException e) {
			String errMsg = "不合法的访问." + e.getMessage();
			throw new Exception(errMsg, e);
		} catch (InvocationTargetException e) {
			String errMsg = "调用目标异常." + e.getMessage();
			throw new Exception(errMsg, e);
		} catch (IllegalArgumentException e) {
			String errMsg = "mapToBean过程中发生了类型不匹配的异常." + " 字段:" + fieldName
					+ ", 期望类型:" + expectType + ", 实际类型:" + actualType
					+ ", 值:" + fieldValue;
			throw new Exception(errMsg, e);
		} catch (Exception e) {
			throw e;
		}
		return t;
	}
	
//	public static void main(String[] args) {
	// RPCTestService_testRPCService_InputBean ii = new
	// RPCTestService_testRPCService_InputBean();
//		ii.setBeanID(99);
//		ii.setExternalSequence("ss");
//
//		Map<String, Object> map = beanToMap(ii);
//	}
}
