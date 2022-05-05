package com.starwars.starwars.controllers;

import com.starwars.starwars.dtos.PersonajeDto;
import com.starwars.starwars.servicios.IPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class personajeController {

    @Autowired
    IPersonajeService personajeService;

    @GetMapping("/personajes/{palabra}")
    public ResponseEntity<List<PersonajeDto>> getPersonajes(@PathVariable String palabra) {
        List<PersonajeDto> personajeDtos = personajeService.buscarCoincidenciaEnNombre(palabra);
        return new ResponseEntity<>(personajeDtos, HttpStatus.OK);
    }

}
