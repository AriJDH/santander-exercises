package com.example.ejercicioStarWars.controllers;


import com.example.ejercicioStarWars.dtos.PersonajeDto;
import com.example.ejercicioStarWars.services.IPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonajeController {

    @Autowired
    IPersonajeService personajeService;


    @GetMapping("/personajes/{palabra}")
    public ResponseEntity<List<PersonajeDto>> getPersonajes(@PathVariable String palabra){
        List<PersonajeDto> personajeDtos = personajeService.findConcidencia(palabra);
        return new ResponseEntity<>(personajeDtos, HttpStatus.OK);

    }
}
