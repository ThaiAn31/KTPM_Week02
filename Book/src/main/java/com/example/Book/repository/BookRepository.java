package com.example.Book.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.Book.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findAll();

	Optional<Book> findById(Long id);

}
