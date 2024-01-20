package com.example.user.service;

import com.example.user.entity.Order;

public interface OrderService {
	 void addOrder(Order order, Long bookId);
}
