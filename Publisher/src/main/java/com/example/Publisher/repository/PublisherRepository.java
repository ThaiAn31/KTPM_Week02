package com.example.Publisher.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.Publisher.entity.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
	List<Publisher> findAll();

	Optional<Publisher> findById(Long id);

}
