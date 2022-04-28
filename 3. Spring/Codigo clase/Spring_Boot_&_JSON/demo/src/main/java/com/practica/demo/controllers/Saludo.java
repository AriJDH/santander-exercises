package com.practica.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class Saludo {

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola mundo";
    }


    //Lo que pongas en el {} va a tener que ser igual al nombre de la variable que recibe en el parametro.
    @GetMapping("/saludo/{nombre}")
    public String saludar(@PathVariable String nombre){
        return "Hola "+nombre;
    }

    @GetMapping("/saludo/{nombre}/{apellido}/{direccion}")
    public String saludar(@PathVariable String nombre,@PathVariable String apellido,@PathVariable String direccion){
        return "Hola "+nombre+ " "+apellido+ " "+direccion+ " ";
    }

    //@RequestParam para obtener datos de un formulario que pasa las cosas por get


    //el path no necesita ser igual que el metodo y no hace falta el /. Evitar usar esto con info sensible.
    @GetMapping("/getsaludo/")
    public String saludar(@RequestParam String nombre,@RequestParam String apellido){
        return "Hola por get "+nombre+ " "+apellido+ " ";
    }



}
