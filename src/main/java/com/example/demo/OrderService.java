package com.example.demo;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void placeOrder(){
        paymentService.processPayment(10.00);
    }
    public void setPaymentService(PaymentService paymentService) { //using setter to inject dependency
        this.paymentService = paymentService;
    }
}
