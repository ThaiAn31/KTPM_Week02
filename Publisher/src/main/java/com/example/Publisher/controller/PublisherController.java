package com.example.Publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Publisher.entity.Publisher;
import com.example.Publisher.service.PublisherService;

@RestController
@RequestMapping("/publishers")
public class PublisherController {
	@Autowired
	private PublisherService publisherService;

	@GetMapping
	public List<Publisher> getAllPublishers() {
		return publisherService.getAllPublisher();
	}

	@PostMapping
	public void addPublisher(@RequestBody Publisher publisher) {
		publisherService.addPublisher(publisher);
	}



}
