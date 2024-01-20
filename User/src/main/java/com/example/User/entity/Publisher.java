package com.example.User.entity;


public class Publisher {
	private int id;
	private String publisherName;

	public Publisher(int id, String publisherName) {
		super();
		this.id = id;
		this.publisherName = publisherName;
	}

	public Publisher() {
		super();
	}

	public int getIdPublisher() {
		return id;
	}

	public void setIdPublisher(int id) {
		this.id = id;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publisherName=" + publisherName + "]";
	}

}
