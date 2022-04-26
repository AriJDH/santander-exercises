package com.santanderbootacamp.Ejercicios.controllers;

import com.santanderbootacamp.Ejercicios.services.FechaServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticaIntegradora {

    @GetMapping("calcularEdad/{dia}/{mes}/{anio}")
    public int calcularEdad(@PathVariable int dia, @PathVariable int mes, @PathVariable int anio) {
        return FechaServices.calcularAniosDeFecha(dia, mes, anio);
    }
}
