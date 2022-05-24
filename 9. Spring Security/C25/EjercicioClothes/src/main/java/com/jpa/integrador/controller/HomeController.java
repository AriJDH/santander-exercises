package com.jpa.integrador.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/")
    public String homeMessage(){
        return "Hola esto es el home y lo puede ver cualquiera";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String adminMessage(){
        return "Hola admin";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAuthority('ADMIN') OR hasAuthority('USER')")
    public String UserMessage(){
        return "Hola user";
    }
}
