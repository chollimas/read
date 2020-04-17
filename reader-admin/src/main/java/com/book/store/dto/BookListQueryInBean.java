package com.book.store.dto;

import io.swagger.annotations.ApiModelProperty;

public class BookListQueryInBean {
	@ApiModelProperty(name = "pageNum", value = "页码", dataType = "Integer", example = "1")
	private Integer pageNum;
	@ApiModelProperty(name = "pageSize", value = "每页大小", dataType = "Integer", example = "10")
	private Integer pageSize;
	@ApiModelProperty(name = "title", value = "标题", dataType = "String", example = "活着")
	private String title;
	@ApiModelProperty(name = "author", value = "作者", dataType = "String", example = "余华")
	private String author;

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "BookListQueryInBean [pageNum=" + pageNum + ", pageSize=" + pageSize + ", title=" + title + ", author="
				+ author + "]";
	}
}
