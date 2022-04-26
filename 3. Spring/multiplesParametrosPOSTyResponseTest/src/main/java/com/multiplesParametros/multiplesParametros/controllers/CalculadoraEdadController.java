package com.multiplesParametros.multiplesParametros.controllers;

import com.multiplesParametros.multiplesParametros.servicios.CalculadoraEdadServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraEdadController {


    @GetMapping("/{day}/{month}/{year}")
    public int edad(@PathVariable Integer day, @PathVariable Integer month, @PathVariable Integer year){
            return CalculadoraEdadServicio.getEdad(day,month,year);
    }


}
