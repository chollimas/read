package com.book.store.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.book.store.common.CommonPage;
import com.book.store.common.CommonResult;
import com.book.store.dto.BookListQueryInBean;
import com.book.store.dto.InsertBookInBean;
import com.book.store.dto.ReadPositionInBean;
import com.book.store.dto.ReadPositionOutBean;
import com.book.store.service.BookReadService;
import com.book.store.service.BookService;
import com.book.store.util.BeanMapUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(tags = "BookController", description = "藏书管理")
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookReadService bookReadService;

	@Autowired
	private BookService bookService;

	@ApiOperation("book列表")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public CommonResult<CommonPage<Map<String, Object>>> getPostList(
			@RequestBody BookListQueryInBean bookListQueryInBean) {
		List<Map<String, Object>> postList = bookService.bookList(bookListQueryInBean);
		return CommonResult.success(CommonPage.restPage(postList));
	}

	@ApiOperation("book详情")
	@RequestMapping(value = "/detail", method = RequestMethod.POST)
	@ResponseBody
	public CommonResult<Map<String, Object>> bookDetail(
			@RequestParam(value = "bookId", required = true) String bookId) {
		Map<String, Object> book = bookService.bookDetail(bookId);
		return CommonResult.success(book);
	}

	@ApiOperation("book新增")
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public CommonResult<Map<String, Object>> postDetail(@RequestBody InsertBookInBean insertBookInBean) {
		try {
			Map<String, Object> book = BeanMapUtil.beanToMap(insertBookInBean);
			Map<String, Object> insertBook = bookService.insertBook(book);
			return CommonResult.success(insertBook);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonResult.failed();
		}
	}

	@ApiOperation("book删除")
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public CommonResult<Map<String, Object>> bookDelete(
			@RequestParam(value = "bookId", required = true) String bookId) {
		Map<String, Object> post = bookService.deleteBook(bookId);
		return CommonResult.success(post);
	}

	@ApiOperation("阅读")
	@RequestMapping(value = "/readposition", method = RequestMethod.POST)
	@ResponseBody
	public CommonResult<ReadPositionOutBean> readposition(@RequestBody ReadPositionInBean positionBean) {
		Map<String, Object> context = null;
		try {
			context = BeanMapUtil.beanToMap(positionBean);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonResult.failed();
		}
		Map<String, Object> data;
		data = bookReadService.readPosition(context);
		ReadPositionOutBean readPositionOutBean = new ReadPositionOutBean();
		try {
			if (null != data) {
				readPositionOutBean = BeanMapUtil.mapToBean(data, ReadPositionOutBean.class);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println(readPositionOutBean);
		return CommonResult.success(readPositionOutBean);
	}
}
