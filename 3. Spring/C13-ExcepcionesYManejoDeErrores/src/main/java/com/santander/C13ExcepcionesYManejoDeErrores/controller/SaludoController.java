package com.santander.C13ExcepcionesYManejoDeErrores.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    @Autowired
    @Qualifier("PersonaService")

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonaController.class);

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola mundo";
    }

    @GetMapping("/saludar/{nombre}")
    public String saludar(@PathVariable String nombre) {
        return "Hola " + nombre;
    }

    @GetMapping("/saludar1/{nombre}/{apellido}/{direccion}")
    public String saludar(@PathVariable String nombre, @PathVariable String apellido, @PathVariable String direccion ) {
        return "Hola " + nombre + " " + apellido + " " + direccion;
    }

    @GetMapping("/getsaludo")
    public String getsaludo(@RequestParam String nombre, @RequestParam String apellido) {
        return "Hola por get " + nombre + " " + apellido;
    }

    /*
    // no hacer
    @GetMapping("/getcredenciales")
    public String getcredenciales(@RequestParam String usuario, @RequestParam String password) {
        return "Hola por get " + usuario + " " + password;
    }
     */
}
