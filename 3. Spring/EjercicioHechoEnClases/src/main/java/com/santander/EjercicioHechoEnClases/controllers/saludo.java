package com.santander.EjercicioHechoEnClases.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class saludo {

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola Mundo";
    }

    @GetMapping("/saludar/{nombre}")
    public String saludar(@PathVariable String alguien){
        return "Hola" + alguien;
    }

    @GetMapping("/saludar/{nombre}/{apellido}/{direccion}")
    public String saludar(@PathVariable String nombre,@PathVariable String apellido,@PathVariable String direccion){
        return "Hola" + nombre +" "+ apellido +" "+ direccion;
    }
    //localhost/8080/getsaludo?=
    @GetMapping("/getsaludo")
    public String getsaludo(@RequestParam String nombre,@RequestParam String apellido){
        return "Hola por get" + nombre +" "+ apellido;
    }

    /*@GetMapping("/getcredenciales")
    public String getcredenciales(@RequestParam String usuario,@RequestParam String password){
        return "Hola por get" + usuario +" "+ password;
        //NO SE HACE ¡MUY MAL!
    }*/
}
