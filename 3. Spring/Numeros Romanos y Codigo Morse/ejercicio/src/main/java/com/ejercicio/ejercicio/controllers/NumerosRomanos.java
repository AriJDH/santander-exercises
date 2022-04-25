package com.ejercicio.ejercicio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanos {


    @GetMapping(path = "/numerosromanos/{num}")

    public String numero(@PathVariable int num){








        return "hola";

    }

}
