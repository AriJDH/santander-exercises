package com.santander.c11p2.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraEdad {

    @GetMapping("/{anio}/{mes}/{dia}")
    public String calcularEdad(@PathVariable Integer anio, @PathVariable Integer mes, @PathVariable Integer dia){

        int anio_actual = 2022;
        int mes_actual = 04;
        int dia_actual = 26;

        int edad = anio_actual  - anio;

        if (mes > mes_actual) {
            edad--;
        } else if (mes == mes_actual && dia > dia_actual) {
            edad--;
        }

        return "La edad es " + edad;

    }
}
