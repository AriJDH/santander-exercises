package com.santander.practica_json.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
    @GetMapping("/saludo")
    public String saludo() {
        return "Hola mundo";
    }

    @GetMapping("/saludar/{persona}")
    public String saludar(@PathVariable String persona) {
        return "Hola " + persona;
    }

    @GetMapping("/getSaludo")
    public String getSaludo(@RequestParam String nombre, @RequestParam String apellido) {
        return "Hola por get " + nombre + " " + apellido;
    }

}
