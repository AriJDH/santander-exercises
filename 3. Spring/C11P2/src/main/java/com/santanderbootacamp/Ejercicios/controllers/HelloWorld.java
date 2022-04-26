package com.santanderbootacamp.Ejercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String saludar(@RequestParam String nombre) {
        return "Hello World " + nombre;
    }
}