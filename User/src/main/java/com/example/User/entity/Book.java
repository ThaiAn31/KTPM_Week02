package com.example.User.entity;


public class Book {
	private int id;

	private String bookName;

	private float price;

	private String publisher;

	public Book(int id, String bookName, float price, String publisher) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.price = price;
		this.publisher = publisher;
	}

	public Book() {
		super();
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", price=" + price + "]";
	}

}
