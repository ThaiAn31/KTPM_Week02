package com.example.Book.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Book.entity.Publisher;

@FeignClient(name = "publisher-service")
public interface PublisherFeignClient {
	@GetMapping("/publishers")
	List<Publisher> getAllPublishers();
}
