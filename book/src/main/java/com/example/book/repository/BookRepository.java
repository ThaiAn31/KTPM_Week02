package com.example.book.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.book.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findAll();

	Optional<Book> findById(Long id);

}
