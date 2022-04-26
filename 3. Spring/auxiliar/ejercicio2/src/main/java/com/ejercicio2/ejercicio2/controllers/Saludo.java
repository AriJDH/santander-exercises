package com.ejercicio2.ejercicio2.controllers;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    /*@GetMapping("/saludo")
    public String saludo(){
        return "Hola mundo";
    }*/

    @GetMapping("/saludar/{alguien}")
    public String saludar(@PathVariable String alguien){
        return "Hola " + alguien;
    }

    @GetMapping("/getsaludo")
    public String getSaludo (@RequestParam String nombre, @RequestParam String apellido){
        return "Hola por get " + nombre + " " + apellido;
    }

    /*@GetMapping("/getcredenciales")
    public String getCredenciales (@RequestParam String usuario, @RequestParam String password){
        return "Hola por get " + usuario + " " + password;
    }*/
    //MAL



}
