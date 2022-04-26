package com.bootcamp.C11P2.controllers;

import com.bootcamp.C11P2.services.PersonaServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping(path = "hello")
    public String saludar(){
        return "Hello World";
    }

    @GetMapping(path = "hello/{nombre}")
    public String Saludar(@PathVariable String nombre){
        return "Hello World " + nombre;
    }

    @GetMapping(path = "hello/{nombre}/{apellido}/{edad}")
    public String Saludar(@PathVariable String nombre, @PathVariable String apellido, @PathVariable int edad){
        return "Hello World! Tu nombre es: " + nombre + ", tu apellido es: " + apellido + ", y tenes " + edad + " años";
    }

    @GetMapping(path = "calcularEdad/{dia}/{mes}/{anio}")
    public String calcularEdad(@PathVariable String dia, @PathVariable String mes, @PathVariable String anio){
        return "Tu edad es " + String.valueOf(PersonaServicio.calcularEdad(dia, mes, anio));
    }

    @GetMapping(path = "hello/{nombre}/{apellido}/{dia}/{mes}/{anio}")
    public String Saludar(@PathVariable String nombre, @PathVariable String apellido, @PathVariable String dia, @PathVariable String mes, @PathVariable String anio){
        return "Hello World! Tu nombre es: " + nombre + ", tu apellido es: " + apellido +
                ", y tenes " + String.valueOf(PersonaServicio.calcularEdad(dia, mes, anio)) + " años";
    }

}
