package com.ejercicio.ejercicio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    @GetMapping(path="/{name}")
    public String saludar(@PathVariable String name){
        return "Hola, " + name;
    }
}
