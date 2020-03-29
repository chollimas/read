package com.book.store.dto;

import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModelProperty;

public class ReadPositionInBean {
	@ApiModelProperty(value = "书籍编号", required = true, example = "34924767")
	@NotEmpty(message = "当前位置不能为空")
	private String bookId;

	@ApiModelProperty(value = "当前位置", required = true, example = "0")
	@NotEmpty(message = "当前位置不能为空")
	private long currentPosition;

	@ApiModelProperty(value = "每页字数", required = true, example = "100")
	@NotEmpty(message = "每页字数不能为空")
	private int pageSize;

	@ApiModelProperty(value = "是否下一页", required = true, example = "true")
	@NotEmpty(message = "是否下一页不能为空")
	private int isNext;

	@ApiModelProperty(value = "是否下一页", required = true, example = "true")
	@NotEmpty(message = "是否下一页不能为空")
	private String openid;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public long getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(long currentPosition) {
		this.currentPosition = currentPosition;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getIsNext() {
		return isNext;
	}

	public void setIsNext(int isNext) {
		this.isNext = isNext;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	@Override
	public String toString() {
		return "ReadPositionInBean [bookId=" + bookId + ", currentPosition=" + currentPosition + ", pageSize="
				+ pageSize + ", isNext=" + isNext + ", openid=" + openid + "]";
	}

}
