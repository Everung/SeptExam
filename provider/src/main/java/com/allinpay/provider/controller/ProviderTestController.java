package com.allinpay.provider.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderTestController {

    @PostMapping("/testController2")
    public String testController2(){
        return "This is Provider Controller";
    }
}
