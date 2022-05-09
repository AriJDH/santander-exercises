package com.c11p2.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola mundo";
    }

    @GetMapping("/saludar/{nombre}/{apellido}")
    public String saludar(@PathVariable String nombre, @PathVariable String apellido){
        return "Hola " + nombre +" "+ apellido;
    }

    @GetMapping("/getsaludo")
    public String getSaludo(@RequestParam String nombre, @RequestParam String apellido){
        return "Hola por get " + nombre +" "+ apellido;
    }
}
