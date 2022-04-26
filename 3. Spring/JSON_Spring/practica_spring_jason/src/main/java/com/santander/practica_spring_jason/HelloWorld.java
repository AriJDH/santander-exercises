package com.santander.practica_spring_jason;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
public class HelloWorld {
    private Service service = new Service();

    @GetMapping(path = "/hello/{nombre}/{apellido}/{edad}")
    public String saludar(@PathVariable String nombre, @PathVariable String apellido, @PathVariable int edad) {
        return service.Saludar() + " Tu nombre es: " + nombre + ", tu apellido es: " + apellido + " y tenés " + edad + " años.";
    }

    @GetMapping(path = "/{dia}/{mes}/{anio}")
    public int calcular(@PathVariable int dia, @PathVariable int mes, @PathVariable int anio){
        return service.Calcular(dia, mes, anio);
    }
}
