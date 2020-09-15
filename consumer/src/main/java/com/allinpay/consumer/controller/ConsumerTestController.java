package com.allinpay.consumer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerTestController {

    @PostMapping("/testController")
    public String testController(){
        return "this is consumer test";
    }
}
