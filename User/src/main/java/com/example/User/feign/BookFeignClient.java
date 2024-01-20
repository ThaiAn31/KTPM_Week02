package com.example.User.feign;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.User.entity.Book;

@FeignClient(name = "book-service")
public interface BookFeignClient {
	@PostMapping("/books")
	void addBook(@RequestBody Book book);
}
