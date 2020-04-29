package com.book.store.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.book.store.mapper.TbCommonConfigMapper;
import com.book.store.model.TbCommonConfig;
import com.book.store.model.TbCommonConfigExample;

/**
 * 
 * @ClassName: CommonConfigUtil
 * @Description:
 * @author: King
 * @Version: 1.0
 * @date: 2020年4月29日 下午4:10:18
 */
public class CommonConfigUtil {

	@Autowired
	private static TbCommonConfigMapper commonConfigMapper;

	/**
	 * 
	 * @Title: getConfigValue
	 * @Description: TODO
	 * @param commonKey
	 * @return String
	 * @author King
	 * @date 2020年4月29日 下午4:23:00
	 */
	public static String getConfigValue(String commonKey) {
		String commonValue = "";
		TbCommonConfigExample example = new TbCommonConfigExample();
		example.createCriteria().andCommonKeyEqualTo(commonKey);
		List<TbCommonConfig> list = commonConfigMapper.selectByExample(example);
		if (null != list && list.size() > 0) {
			commonKey = list.get(0).getCommonValue();
		}
		return commonValue;
	}
}
