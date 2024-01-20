package com.example.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.entity.Book;

@Service
public class UserService {
	@Autowired
	private RestTemplate restTemplate;

	private final String bookServerUrl = "http://localhost:8082/books"; // Thay thế bằng URL thực tế của Server Book

	public List<Book> getAllBooks() {
		// Gọi API từ Server Book để lấy danh sách sách
		List<Book> books = restTemplate.getForObject(bookServerUrl, List.class);
		return books;
	}
}
