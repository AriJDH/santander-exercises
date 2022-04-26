package com.santander.bootcamp.M4C11P2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/hello")
    public String saludar() {
        return "Hello World";
    }

    @GetMapping("/hello/{nombre}")
    public String saludar(@PathVariable String nombre) {
        return String.format("Hello World %s", nombre);
    }

    @GetMapping("/hello/{nombre}/{apellido}/{edad}")
    public String saludar(@PathVariable String nombre, @PathVariable String apellido, @PathVariable int edad) {
        return String.format("Hello World! Tu nombre es: %s, tu apellido es: %s y tenés %d años", nombre, apellido, edad);
    }
}

