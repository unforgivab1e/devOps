package com.example.devops.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "Hello Jenkins";
    }

    @GetMapping("/test1")
    public String test1(){
        return "Hello Jenkins11";
    }
    @GetMapping("/test2")
    public String test2(){
        return "Hello Jenkins111";
    }
}
