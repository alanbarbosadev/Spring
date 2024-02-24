package com.devsuperior.exercicio.services;

import org.springframework.stereotype.Service;

import com.devsuperior.exercicio.entities.Order;

@Service
public class DiscountService {

	public double calculateDiscount(Order order) {
		return order.getPrice() * (order.getDiscount() / 100);
	};
}
