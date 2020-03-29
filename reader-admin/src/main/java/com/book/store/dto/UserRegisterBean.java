package com.book.store.dto;

public class UserRegisterBean {
	private String rawData;

	public String getRawData() {
		return rawData;
	}

	public void setRawData(String rawData) {
		this.rawData = rawData;
	}

	@Override
	public String toString() {
		return "UserRegisterBean [rawData=" + rawData + "]";
	}
}
