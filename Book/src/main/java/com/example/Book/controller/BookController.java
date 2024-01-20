package com.example.Book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Book.entity.Book;
import com.example.Book.entity.Publisher;
import com.example.Book.feign.PublisherFeignClient;
import com.example.Book.service.BookService;


@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookService;

	@Autowired
	private PublisherFeignClient publisherFeignClient;

	@GetMapping
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@PostMapping
	public void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}

	@GetMapping("/publishers")
	public List<Publisher> getAllPublishers() {
		return publisherFeignClient.getAllPublishers();
	}
}
