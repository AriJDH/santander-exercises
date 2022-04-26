package com.bootcamp.C11P1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    @GetMapping(path = "/saludar")
    public String saludar(@RequestParam(value = "name", defaultValue = "mundo") String name){
        return "Hola " + name;
    }

}
