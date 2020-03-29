package com.book.store.dto;

import io.swagger.annotations.ApiModelProperty;

public class InsertBookInBean {
	@ApiModelProperty(value = "book编号", required = true)
	private String bookId;

	@ApiModelProperty(name = "title", value = "标题", dataType = "String", example = "aaa")
	private String title;

	@ApiModelProperty(name = "subTitle", value = "副标题", dataType = "String", example = "aaa")
	private String subTitle;

	@ApiModelProperty(name = "author", value = "作者", dataType = "String", example = "aaa")
	private String author;

	@ApiModelProperty(name = "pubDate", value = "出版日期", dataType = "String", example = "aaa")
	private String pubDate;

	@ApiModelProperty(name = "originTitle", value = "源标题", dataType = "String", example = "aaa")
	private String originTitle;

	@ApiModelProperty(name = "image", value = "封面图片", dataType = "String", example = "aaa")
	private String image;

	@ApiModelProperty(name = "binding", value = "装帧:", dataType = "String", example = "aaa")
	private String binding;

	@ApiModelProperty(name = "translator", value = "译者", dataType = "String", example = "aaa")
	private String translator;

	@ApiModelProperty(name = "catalog", value = "", dataType = "String", example = "aaa")
	private String catalog;

	@ApiModelProperty(name = "pages", value = "页数", dataType = "Integer", example = "100")
	private Integer pages;

	@ApiModelProperty(name = "publisher", value = "出版社", dataType = "String", example = "aaa")
	private String publisher;

	@ApiModelProperty(name = "isbn10", value = "ISBN", dataType = "String", example = "aaa")
	private String isbn10;

	@ApiModelProperty(name = "isbn13", value = "ISBN", dataType = "String", example = "aaa")
	private String isbn13;

	@ApiModelProperty(name = "url", value = "", dataType = "String", example = "aaa")
	private String url;

	@ApiModelProperty(name = "altTitle", value = "", dataType = "String", example = "aaa")
	private String altTitle;

	@ApiModelProperty(name = "authorIntro", value = "作者简介", dataType = "String", example = "aaa")
	private String authorIntro;

	@ApiModelProperty(name = "price", value = "价格", dataType = "String", example = "aaa")
	private String price;

	@ApiModelProperty(name = "summary", value = "内容摘要", dataType = "String", example = "aaa")
	private String summary;
	
	@ApiModelProperty(name = "tags", value = "标签", dataType = "String", example = "aaa")
	private String tags;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId == null ? null : bookId.trim();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle == null ? null : subTitle.trim();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author == null ? null : author.trim();
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate == null ? null : pubDate.trim();
	}

	public String getOriginTitle() {
		return originTitle;
	}

	public void setOriginTitle(String originTitle) {
		this.originTitle = originTitle == null ? null : originTitle.trim();
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image == null ? null : image.trim();
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding == null ? null : binding.trim();
	}

	public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator == null ? null : translator.trim();
	}

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog == null ? null : catalog.trim();
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher == null ? null : publisher.trim();
	}

	public String getIsbn10() {
		return isbn10;
	}

	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10 == null ? null : isbn10.trim();
	}

	public String getIsbn13() {
		return isbn13;
	}

	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13 == null ? null : isbn13.trim();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	public String getAltTitle() {
		return altTitle;
	}

	public void setAltTitle(String altTitle) {
		this.altTitle = altTitle == null ? null : altTitle.trim();
	}

	public String getAuthorIntro() {
		return authorIntro;
	}

	public void setAuthorIntro(String authorIntro) {
		this.authorIntro = authorIntro == null ? null : authorIntro.trim();
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price == null ? null : price.trim();
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary == null ? null : summary.trim();
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

}
