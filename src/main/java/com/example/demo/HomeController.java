package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //tell compiler to watch this file as controller
public class HomeController {
    @Value("${spring.application.name}") //take value from application properties and put it to appName;
    private String appName;
    @RequestMapping("/home") // define route and tell what to do when request comes to this route
    public String index(){
        System.out.println("Appname " + appName);
        return ("index.html");
    }
}
