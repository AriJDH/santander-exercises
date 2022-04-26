package com.ejercicio.ejercicio.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    @GetMapping(path = "/name/")
    public String saludar(@RequestParam String nombre,
                          @RequestParam String apellido) {
        return saludar(nombre, apellido);
    }

    @GetMapping("/{day}/{month}/{year}")
    public String getAge(@PathVariable Integer day, @PathVariable Integer month, @PathVariable Integer year){
        return "fecha" + day + month + year;
    }


}