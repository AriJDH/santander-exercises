package com.ejercicio.ejercicio.controllers;

import com.ejercicio.ejercicio.Services.Calculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class AppController {

    @GetMapping(path = "/calcular/{day}/{month}/{year}/")
    public int calcular(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        LocalDate fecha = LocalDate.of(year, month, day);
        return Calculadora.getEdad(fecha);
    }

}
