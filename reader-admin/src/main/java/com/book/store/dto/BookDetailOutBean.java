package com.book.store.dto;

public class BookDetailOutBean {
	private String title;
	private String subTitle;
	private String author;
	private String pubDate;
	private String originTitle;
	private String authorIntro;
	private String summary;
	private String bookId;
	private String image;
	private String publisher;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public String getOriginTitle() {
		return originTitle;
	}

	public void setOriginTitle(String originTitle) {
		this.originTitle = originTitle;
	}

	public String getAuthorIntro() {
		return authorIntro;
	}

	public void setAuthorIntro(String authorIntro) {
		this.authorIntro = authorIntro;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "BookDetailOutBean [title=" + title + ", subTitle=" + subTitle + ", author=" + author + ", pubDate="
				+ pubDate + ", originTitle=" + originTitle + ", authorIntro=" + authorIntro + ", summary=" + summary
				+ ", bookId=" + bookId + ", image=" + image + ", publisher=" + publisher + "]";
	}
}
