package com.example.demo;

import org.springframework.stereotype.Service;

public class PayPalPaymentService implements PaymentService{

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment successful by PayPal");
        System.out.println("AMOUNT " + amount);
    }
}
