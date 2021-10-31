package com.sks.discoveryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCOntroller {

    @RequestMapping(value = "/service")
    public String home() {
        return "Welcome to eureka service discovery";
    }
}
