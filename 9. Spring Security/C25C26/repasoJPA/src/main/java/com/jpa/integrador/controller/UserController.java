package com.jpa.integrador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello world";
    }

    @GetMapping("/user")
    public String helloUser(){
        return "Hello user";
    }

    @GetMapping("/admin")
    public String helloAdmin(){
        return "Hello admin";
    }

}
