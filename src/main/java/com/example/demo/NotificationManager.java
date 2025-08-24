package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class NotificationManager {
    private final NotificationService notificationService;
    public NotificationManager( NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public  void sendMessage(String message){
        notificationService.send(message);
    }
}
