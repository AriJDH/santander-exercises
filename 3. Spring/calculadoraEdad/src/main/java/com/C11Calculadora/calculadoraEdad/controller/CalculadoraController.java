package com.C11Calculadora.calculadoraEdad.controller;

import com.C11Calculadora.calculadoraEdad.services.Calculador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
    Calculador calculador = new Calculador();
    @GetMapping(path = "/calcudora")
    public int calcularEdad(@RequestParam int dia,@RequestParam int mes,@RequestParam int anio){
        return calculador.Calcular(dia,mes,anio);
    }
}
