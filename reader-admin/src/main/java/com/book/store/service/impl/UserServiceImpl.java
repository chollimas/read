package com.book.store.service.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.book.store.common.CommonConstent;
import com.book.store.common.HttpUtils;
import com.book.store.dto.CodeSession;
import com.book.store.mapper.TbUserMapper;
import com.book.store.model.TbUser;
import com.book.store.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	TbUserMapper userMapper;

	@Override
	public void login(String code, String rawData, String signature) {
		// 1.获取session_key 和 openid
		String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + CommonConstent.APPID + "&secret="
				+ CommonConstent.APP_SECRET + "&js_code=" + code + "&grant_type=authorization_code";
		CodeSession codeSession = HttpUtils.restRequest(url, HttpMethod.GET, CodeSession.class);
		System.out.println(codeSession);

		// 2.用户签名校验
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA1");
			byte[] input = (rawData + codeSession.getSession_key()).getBytes();
			byte[] result = digest.digest(input);
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < result.length; i++) {
				sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
			}
			String cipherData = sb.toString();
			if (!cipherData.equals(signature)) {
				System.out.println("signature:" + signature + "\ncipherData:" + cipherData);
				return;
			} else {
				System.out.println("用户信息准确");
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		maintUser(codeSession.getOpenid(), rawData);
	}

	private void maintUser(String openid, String json) {
		TbUser user = userMapper.selectByPrimaryKey(openid);
		JSONObject jsonObject = JSON.parseObject(json);
		String avatarUrl = jsonObject.getString("avatarUrl");
		String city = jsonObject.getString("city");
		String country = jsonObject.getString("country");
		String gender = jsonObject.getString("gender");
		String language = jsonObject.getString("language");
		String nickName = jsonObject.getString("nickName");
		String province = jsonObject.getString("province");

		if (user == null) {
			user = new TbUser();
			user.setAvatarUrl(avatarUrl);
			user.setCity(city);
			user.setCountry(country);
			user.setGender(gender);
			user.setLanguage(language);
			user.setNickName(nickName);
			user.setOpenid(openid);
			user.setProvince(province);
			userMapper.insert(user);
		} else {
			if (null != avatarUrl) {
				user.setAvatarUrl(avatarUrl);
			}
			if (null != city) {
				user.setCity(city);
			}
			if (null != country) {
				user.setCountry(country);
			}
			if (null != gender) {
				user.setGender(gender);
			}
			if (null != language) {
				user.setLanguage(language);
			}
			if (null != nickName) {
				user.setNickName(nickName);
			}
			if (null != province) {
				user.setProvince(province);
			}
			userMapper.updateByPrimaryKey(user);
		}
	}
}
