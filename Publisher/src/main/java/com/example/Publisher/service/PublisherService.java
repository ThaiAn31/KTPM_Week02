package com.example.Publisher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Publisher.entity.Publisher;
import com.example.Publisher.repository.PublisherRepository;

@Service
public class PublisherService {
	@Autowired
	private PublisherRepository publisherRepository;

	public List<Publisher> getAllPublisher() {
        return (List<Publisher>) publisherRepository.findAll();
    }

    public void addPublisher(Publisher publisher) {
    	publisherRepository.save(publisher);
    }
}
