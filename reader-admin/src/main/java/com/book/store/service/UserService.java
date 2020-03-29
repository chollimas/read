package com.book.store.service;

public interface UserService {
	public void login(String code, String rawData, String signature);
}
