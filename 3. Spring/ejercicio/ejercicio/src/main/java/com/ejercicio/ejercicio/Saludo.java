package com.ejercicio.ejercicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
    @GetMapping
    public String saludar() {
        return "Hola mundo, como va?";
    }
}
