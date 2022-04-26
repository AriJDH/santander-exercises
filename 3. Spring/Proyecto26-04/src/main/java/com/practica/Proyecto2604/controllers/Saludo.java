package com.practica.Proyecto2604.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
    @GetMapping("/saludo")
    public String salud(){
        return "Hola mundo";
    }
    @GetMapping("/saludar/{nombre}")
    public String saludar(@PathVariable  String nombre){
        return "Hola "+nombre;
    }
    @GetMapping("/saludar1/{nombre}/{apellido}/{direccion}")
    public String saludar(@PathVariable  String nombre,@PathVariable  String apellido,@PathVariable  String direccion){
        return "Hola "+nombre+" apellido:"+apellido+" dirección:"+direccion;
    }
    @GetMapping("/getsaludo")
    public String getsaludo(@RequestParam String nombre, @RequestParam String apellido){
        return "Hola por get " + nombre + " " + apellido;
    }
}
