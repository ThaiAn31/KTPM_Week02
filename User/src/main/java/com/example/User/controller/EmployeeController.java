package com.example.User.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.User.entity.Book;
import com.example.User.entity.Publisher;
import com.example.User.service.EmployeeService;

@RestController
@RequestMapping("/users")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/addBook")
	public void addBookToUser(@RequestBody Book book) {
		employeeService.addBookToUser(book);
	}

	@PostMapping("/addPublisher")
	public void addPublisherToUser(@RequestBody Publisher publisher) {
		employeeService.addPublisherToUser(publisher);
	}
}
