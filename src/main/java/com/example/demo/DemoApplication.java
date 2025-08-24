package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
        //injecting dependency here, modular code
        var OrderService = new OrderService(new PayPalPaymentService()); //just change the dependency here in the parameter to change payment service
//        OrderService.setPaymentService(new StripePaymentService());
        OrderService.placeOrder();
	}

}
