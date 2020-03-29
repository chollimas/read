package com.book.store.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.book.store.common.CommonResult;
import com.book.store.dto.ReadPositionInBean;
import com.book.store.service.BookReadService;
import com.book.store.util.BeanMapUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(tags = "ReadController", description = "阅读")
@RequestMapping("/user")
public class ReadController {
	@Autowired
	private BookReadService bookReadService;

	@ApiOperation("阅读")
	@RequestMapping(value = "/bookreadposition", method = RequestMethod.GET)
	@ResponseBody
	public CommonResult readposition(@RequestBody ReadPositionInBean positionBean) {
		Map<String, Object> context = null;
		try {
			context = BeanMapUtil.beanToMap(positionBean);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonResult.failed();
		}
		Map<String, Object> data;
		data = bookReadService.readPosition(context);
		return CommonResult.success(data);
	}
}
