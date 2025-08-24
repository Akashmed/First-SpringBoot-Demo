package com.example.demo;

import org.springframework.stereotype.Service;

@Service("sms")
public class SmsNotificationService implements NotificationService{
    @Override
    public void send(String message){
        System.out.println("Sending SMS: " + message);
    }
}
