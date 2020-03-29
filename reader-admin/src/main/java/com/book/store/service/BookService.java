package com.book.store.service;

import java.util.List;
import java.util.Map;

public interface BookService {
	public List<Map<String, Object>> bookList(Integer pageNum, Integer pageSize);

	public Map<String, Object> bookDetail(String bookId);

	public Map<String, Object> insertBook(Map<String, Object> book);

	public Map<String, Object> deleteBook(String bookId);
}
