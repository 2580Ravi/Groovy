package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class UnderstandingAutowiredApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(UnderstandingAutowiredApplication.class, args);
		
		Invoice inv = ctx.getBean(Invoice.class);
		System.out.println(inv);
		
	}
	
	@Bean
	public Customer vikas() {
		return new Customer(110,"Vikas","vikas@gmail.com");
	}
	
	@Bean
	@Primary
	public Customer raju() {
		return new Customer(110,"raju","raju@gmail.com");
	}
	
	@Bean
	public Product tv() {
		return new Product(2020,"Sony TV",34000);
	}
}
