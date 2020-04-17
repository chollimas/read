package com.book.store.service;

import java.util.List;
import java.util.Map;

import com.book.store.dto.BookListQueryInBean;

public interface BookService {
	public List<Map<String, Object>> bookList(BookListQueryInBean bookListQueryInBean);

	public Map<String, Object> bookDetail(String bookId);

	public Map<String, Object> insertBook(Map<String, Object> book);

	public Map<String, Object> deleteBook(String bookId);
}
