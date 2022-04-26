package com.clase.C11P2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    @GetMapping
    public String saludo(){
        return "Hola mundo";
    }

    @GetMapping("/saludar/{nombre}")
    public String saludo(@PathVariable String nombre){
        return "Hola " + nombre;
    }

    @GetMapping("/saludar/{nombre}/{apellido}/{direccion}")
    public String saludo(@PathVariable String nombre, @PathVariable String apellido,
                         @PathVariable String direccion){
        return "Hola " + nombre + " " + apellido + " " + direccion;
    }

    @GetMapping("/getsaludo")
    public String getSaludo(@RequestParam String nombre, @RequestParam String apellido,
                            @RequestParam String direccion){
        return "Hola por get " + nombre + " " + apellido + " " + direccion;
    }
}
