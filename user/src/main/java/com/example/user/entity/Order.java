package com.example.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderCus")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOrder;
	@Column(name = "orderBy")
	private String orderBy;

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Order(int idOrder, String orderBy) {
		super();
		this.idOrder = idOrder;
		this.orderBy = orderBy;
	}

	public Order() {
		super();
	}

	@Override
	public String toString() {
		return "Order [idOrder=" + idOrder + ", orderBy=" + orderBy + "]";
	}

}
