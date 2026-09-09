package com.example.Javafirstapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myclass {
    @GetMapping("user")
    public String sayHello() {
        return "Hello";
    }
}
