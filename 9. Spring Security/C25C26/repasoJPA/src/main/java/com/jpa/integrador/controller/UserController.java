package com.jpa.integrador.controller;

import com.jpa.integrador.dto.LoginDTO;
import com.jpa.integrador.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

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

    @GetMapping("/login/{username}")
    public String helloAdmin(@PathVariable String username){
        userService.login(username);
        return "Logeado rey";
    }

}
