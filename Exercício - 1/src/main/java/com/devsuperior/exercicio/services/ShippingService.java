package com.devsuperior.exercicio.services;

import org.springframework.stereotype.Service;

import com.devsuperior.exercicio.entities.Order;

@Service
public class ShippingService {
	public double calculateShipping(Order order) {
		if (order.getPrice() < 100) return 20;
		
		if (order.getPrice() >= 100 && order.getPrice() < 200) return 12;
		
		return 0;
	}
}
