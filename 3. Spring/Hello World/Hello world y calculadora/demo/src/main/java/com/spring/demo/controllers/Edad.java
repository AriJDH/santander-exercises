package com.spring.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Edad {
    @GetMapping(path = "/datos/{nombre}/{apellido}/{edad}")

        public static String datos(@PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido, @PathVariable("edad") String edad ){
            StringBuilder concatenacion= new StringBuilder();
            return "Hello World, tu nombre es: " + nombre + ", tu apellido es: " + apellido + " y tienes" + edad;


    }
}
