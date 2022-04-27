package com.ejercicio2.Ejercicio2.controller;

import com.ejercicio2.Ejercicio2.dto.PersonajeDTO;
import com.ejercicio2.Ejercicio2.models.Personaje;
import com.ejercicio2.Ejercicio2.service.StarWarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StarWarController {
    @Autowired
    StarWarService starWarService;


    @GetMapping("/{nombre}")
    public List<PersonajeDTO> buscarPersonaje(@PathVariable String nombre){
        return starWarService.buscarPersonaje(nombre);
    }
}
