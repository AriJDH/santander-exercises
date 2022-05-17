package com.example.jewelry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JewelryController {

    @GetMapping("/home")
    public String home(){
        return "You are in home";
    }
}
