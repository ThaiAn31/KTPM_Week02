package com.example.User.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.User.entity.Book;
import com.example.User.entity.Publisher;
import com.example.User.feign.BookFeignClient;
import com.example.User.feign.PublisherFeignClient;

@Service
public class EmployeeService {
	@Autowired
	private BookFeignClient bookFeignClient;

	@Autowired
	private PublisherFeignClient publisherFeignClient;

	public void addBookToUser(Book book) {
		bookFeignClient.addBook(book);
	}

	public void addPublisherToUser(Publisher publisher) {
		publisherFeignClient.addPublisher(publisher);
	}
}
