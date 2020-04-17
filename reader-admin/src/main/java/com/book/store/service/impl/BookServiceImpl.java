package com.book.store.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.store.dto.BookDetailOutBean;
import com.book.store.dto.BookListQueryInBean;
import com.book.store.mapper.TbBookMapper;
import com.book.store.model.TbBook;
import com.book.store.model.TbBookExample;
import com.book.store.model.TbBookExample.Criteria;
import com.book.store.service.BookService;
import com.book.store.util.BeanMapUtil;
import com.github.pagehelper.PageHelper;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	TbBookMapper bookMapper;

	@Override
	public List<Map<String, Object>> bookList(BookListQueryInBean bookListQueryInBean) {
		Integer pageNum = bookListQueryInBean.getPageNum();
		if (null == pageNum) {
			pageNum = 1;
		}
		Integer pageSize = bookListQueryInBean.getPageSize();
		if (null == pageSize) {
			pageSize = 10;
		}
		PageHelper.startPage(pageNum, pageSize);
		TbBookExample postExample = new TbBookExample();
		Criteria createCriteria = postExample.createCriteria();
		String author = bookListQueryInBean.getAuthor();
		if (null != author) {
			createCriteria.andAuthorEqualTo(author);
		}
		String title = bookListQueryInBean.getTitle();
		if (null != title) {
			createCriteria.andTitleEqualTo(title);
		}
		List<TbBook> bookList = bookMapper.selectByExample(postExample);
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
		for (TbBook book : bookList) {
			Map<String, Object> map = new HashMap<String, Object>(8);
			map.put("title", book.getTitle());
			map.put("image", book.getImage());
			map.put("author", book.getAuthor());
			map.put("publisher", book.getPubDate());
			map.put("pubDate", book.getPubDate());
			map.put("bookId", book.getBookId());
			map.put("tags", book.getTags().split(","));
			mapList.add(map);
		}
		return mapList;
	}

	@Override
	public BookDetailOutBean bookDetail(String bookId) {
		TbBook book = bookMapper.selectByPrimaryKey(bookId);
		BookDetailOutBean out = new BookDetailOutBean();
		if (null != book) {
			out.setTitle(book.getTitle());
			out.setSubTitle(book.getSubTitle());
			out.setAuthor(book.getAuthor());
			out.setPubDate(book.getPubDate());
			out.setOriginTitle(book.getOriginTitle());
			out.setAuthorIntro(book.getAuthorIntro());
			out.setSummary(book.getSummary());
			out.setBookId(book.getBookId());
			out.setImage(book.getImage());
			out.setPublisher(book.getPublisher());
		}
		return out;
	}

	@Override
	public Map<String, Object> insertBook(Map<String, Object> book) {
		Map<String, Object> result = new HashMap<String, Object>(2);
		try {
			TbBook tbBook = BeanMapUtil.mapToBean(book, TbBook.class);
			TbBook res = bookMapper.selectByPrimaryKey(tbBook.getBookId());
			if (res == null) {
				bookMapper.insert(tbBook);
			}
			result.put("message", "添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("message", "添加失败");
		}
		return result;
	}

	@Override
	public Map<String, Object> deleteBook(String bookId) {
		Map<String, Object> result = new HashMap<String, Object>(2);
		bookMapper.deleteByPrimaryKey(bookId);
		result.put("message", "删除成功");
		return result;
	}

}
