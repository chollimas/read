package com.book.store.common;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class HttpUtils {

	public static <T> T restRequest(String url, HttpMethod method, Class<T> responseType) {
		RestTemplate restTemplate = new RestTemplate();

		// 请求格式设置
		HttpHeaders headers = new HttpHeaders();
		// application/json;charset=UTF-8
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
		HttpEntity<String> entity = new HttpEntity<>(headers);
		// 发送请求
		ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		HttpStatus statusCode = exchange.getStatusCode();
		if (!(statusCode == HttpStatus.OK)) {
			return null;
		}
		return convertResponse(responseType, exchange.getBody());
	}

	private static <T> T convertResponse(Class<T> responseType, String json) {
		JSONObject jsonObject = JSON.parseObject(json);
		T javaObject = jsonObject.toJavaObject(responseType);
		return javaObject;
	}

}
