package com.kooki.chap01_poly.model.vo;

public class Book {
	private String title; // ������
	private String author; // ���ڸ�
	private String publisher; // ���ǻ��
	
	public Book() {	}
	
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public String getPublisher() {
		return publisher;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[Book [title=" + title + ", author=" + author 
				+ ", publisher=" + publisher + "], ";
	}

	
	
	
}
