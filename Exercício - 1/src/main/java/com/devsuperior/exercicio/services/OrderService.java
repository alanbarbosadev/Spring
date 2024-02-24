package com.devsuperior.exercicio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.exercicio.entities.Order;

@Service
public class OrderService {
	@Autowired
	private DiscountService discountService;
	
	@Autowired
	private ShippingService shippingService;
	
	public Order processOrder(Order order) {
		double discount = discountService.calculateDiscount(order);
		double shipping = shippingService.calculateShipping(order);
		double finalPrice = order.getPrice() - discount + shipping; 
		
		return new Order(order.getCode(), finalPrice, order.getDiscount());
	}

}
