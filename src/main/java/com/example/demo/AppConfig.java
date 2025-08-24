package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${payment.method}")
    private String method;

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public PaymentService payPal(){
        return new PayPalPaymentService();
    }

    @Bean
    public OrderService orderService(){
        if(method.equals("paypal"))
            return new OrderService(payPal());

        return new OrderService(stripe());

    }
}
