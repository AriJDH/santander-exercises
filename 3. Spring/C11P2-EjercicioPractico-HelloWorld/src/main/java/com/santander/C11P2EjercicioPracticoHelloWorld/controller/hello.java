package com.santander.C11P2EjercicioPracticoHelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/hello/{nombre}/{apellido}/{edad}")
    public String hello(@PathVariable String nombre,@PathVariable String apellido,@PathVariable String edad) {
        return "Hello World! Tu nombre es: "+nombre+", tu apellido es: "+apellido+ " y tenés "+edad+" años";
    }
}
