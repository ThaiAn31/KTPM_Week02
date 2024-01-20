package com.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
