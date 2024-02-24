package com.devsuperior.exercicio.entities;

public class Order {
	private String code;
	private double price;
	private double discount;
	
	public Order(String code, double price, double discount) {
		this.code = code;
		this.price = price;
		this.discount = discount;
	}

	public Order() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double amount) {
		this.price = amount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
