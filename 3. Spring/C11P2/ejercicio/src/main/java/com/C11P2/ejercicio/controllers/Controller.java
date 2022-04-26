package com.C11P2.ejercicio.controllers;

import com.C11P2.ejercicio.services.Servicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Servicio servicio = new Servicio();

    @GetMapping("/{dia}/{mes}/{año}")
    public String edad(@PathVariable int dia, @PathVariable int mes, @PathVariable int año){
        return "La edad es: " + servicio.calcularEdad(dia, mes, año);
    }

}
