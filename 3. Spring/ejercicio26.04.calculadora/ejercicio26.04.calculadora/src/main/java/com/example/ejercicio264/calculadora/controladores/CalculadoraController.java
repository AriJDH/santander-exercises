package com.example.ejercicio264.calculadora.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import servicios.CalculadoraService;

import java.time.Period;

@RestController
public class CalculadoraController {

    @GetMapping("/calcular/{dia}/{mes}/{anio}")
    public int calculo(@PathVariable Integer dia, @PathVariable Integer mes,
                          @PathVariable Integer anio){
        return CalculadoraService.getEdad(dia,mes,anio);
    }
}
