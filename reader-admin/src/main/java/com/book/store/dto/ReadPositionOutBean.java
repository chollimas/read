package com.book.store.dto;

public class ReadPositionOutBean {
	private String content;

	private long currentPosition;

	private long pages;

	private long wordCount;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(long currentPosition) {
		this.currentPosition = currentPosition;
	}

	public long getPages() {
		return pages;
	}

	public void setPages(long pages) {
		this.pages = pages;
	}

	public long getWordCount() {
		return wordCount;
	}

	public void setWordCount(long wordCount) {
		this.wordCount = wordCount;
	}

	@Override
	public String toString() {
		return "ReadPositionOutBean [content=" + content + ", currentPosition=" + currentPosition + ", pages=" + pages
				+ ", wordCount=" + wordCount + "]";
	}

}
