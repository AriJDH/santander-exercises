package com.EjercicioIntegrador.EjercicioIntegrador.controller;

import com.EjercicioIntegrador.EjercicioIntegrador.servicio.ServicioEdad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class CalculadoraEdadController {
    private ServicioEdad servicioEdad= new ServicioEdad();


    @GetMapping (path = "/{dia}/{mes}/{anio}")
    public int calcularEdad(@PathVariable int dia,@PathVariable int mes,@PathVariable int anio){
        LocalDate fechaNacimiento= LocalDate.of(anio,mes,dia);
        return servicioEdad.calcularEdad(fechaNacimiento);
    }

}
