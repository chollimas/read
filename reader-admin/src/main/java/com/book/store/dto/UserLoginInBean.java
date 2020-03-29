package com.book.store.dto;

public class UserLoginInBean {
	private String code;

	private String rawData;

	private String signature;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRawData() {
		return rawData;
	}

	public void setRawData(String rawData) {
		this.rawData = rawData;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	@Override
	public String toString() {
		return "UserLoginInBean [code=" + code + ", rawData=" + rawData + ", signature=" + signature + "]";
	}
}
