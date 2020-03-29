package com.book.store.dto;

import io.swagger.annotations.ApiModelProperty;

public class BookListQueryInBean {
	@ApiModelProperty(name = "pageNum", value = "页码", dataType = "Integer", example = "1")
	private Integer pageNum;
	@ApiModelProperty(name = "pageSize", value = "每页大小", dataType = "Integer", example = "10")
	private Integer pageSize;

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

	@Override
	public String toString() {
		return "GetPostListInBean [pageNum=" + pageNum + ", pageSize=" + pageSize + "]";
	}

}
