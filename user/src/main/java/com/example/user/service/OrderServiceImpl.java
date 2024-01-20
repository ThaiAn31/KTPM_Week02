package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.entity.Book;
import com.example.user.entity.Order;
import com.example.user.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public void addOrder(Order orderCus, Long bookId) {
		ResponseEntity<Book> responseEntity = restTemplate.getForEntity("http://localhost:8082/books/{bookId}",
				Book.class, bookId);
	}

}
