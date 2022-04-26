package com.santanderbootacamp.Ejercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String saludar(@RequestParam String nombre) {
        return "Hello World " + nombre;
    }

    @GetMapping("/hello/{nombre}/{apellido}")
    public String saludar(@PathVariable String nombre, @PathVariable String apellido) {
        return "Hello World! Tu nombre es: " + nombre + ", tu apellido es: " + apellido;
    }
}