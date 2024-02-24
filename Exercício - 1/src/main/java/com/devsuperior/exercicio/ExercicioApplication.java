package com.devsuperior.exercicio;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.exercicio.entities.Order;
import com.devsuperior.exercicio.services.OrderService;

@SpringBootApplication
public class ExercicioApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ExercicioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código: ");
		String code = sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		System.out.print("Desconto: ");
		double discount = sc.nextDouble();
		
		Order order = new Order(code, price, discount);
		
		Order processedOrder = orderService.processOrder(order);
		
		System.out.println("Pedido código: " + processedOrder.getCode());
		System.out.printf("Preço: %.2f%n", processedOrder.getPrice());
		
		sc.close();
	}
}
