package com.example.Book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Book.entity.Book;
import com.example.Book.entity.Publisher;
import com.example.Book.feign.PublisherFeignClient;
import com.example.Book.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private PublisherFeignClient publisherFeignClient;

//	@Autowired
//    private RestTemplate restTemplate;
	public List<Book> getAllBooks() {
		return (List<Book>) bookRepository.findAll();
	}

	public void addBook(Book book) {
		bookRepository.save(book);
	}

	public List<Publisher> getAllPublishers() {
		return publisherFeignClient.getAllPublishers();
	}

}
