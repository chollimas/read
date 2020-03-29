package com.book.store.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.book.store.common.CommonResult;
import com.book.store.dto.UserLoginInBean;
import com.book.store.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 后台用户管理 Created by macro on 2018/4/26.
 */
@Controller
@Api(tags = "UserController", description = "用户管理")
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@ApiOperation(value = "登录以后返回token")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public CommonResult login(@RequestBody UserLoginInBean userLoginInBean) {
		userService.login(userLoginInBean.getCode(), userLoginInBean.getRawData(), userLoginInBean.getSignature());
		Map<String, String> tokenMap = new HashMap<>();
		return CommonResult.success(tokenMap);
	}
}
