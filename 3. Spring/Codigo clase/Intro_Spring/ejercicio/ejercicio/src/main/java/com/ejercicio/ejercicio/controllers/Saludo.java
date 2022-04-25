package com.ejercicio.ejercicio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
    @GetMapping
    public String saludar(){
        return "hola mundo";
    }
}
