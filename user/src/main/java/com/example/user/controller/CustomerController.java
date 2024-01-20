package com.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.user.entity.Book;
@RestController
@RequestMapping("/users")
public class CustomerController {
	@Autowired
	private RestTemplate restTemplate;

	private final String bookServerUrl = "http://localhost:8082/books"; // Thay thế bằng URL thực tế của Server Book

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		// Gọi API từ Server Book để lấy danh sách sách
		List<Book> books = restTemplate.getForObject(bookServerUrl, List.class);
		return books;
	}
}
