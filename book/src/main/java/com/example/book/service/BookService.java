package com.example.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.entity.Book;
import com.example.book.repository.BookRepository;
@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

//	@Autowired
//    private RestTemplate restTemplate;
	public List<Book> getAllBooks() {
		return (List<Book>) bookRepository.findAll();
	}

	public void addBook(Book book) {
		bookRepository.save(book);
	}
}
