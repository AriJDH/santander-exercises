package com.starwars.starwars.controllers;

import com.starwars.starwars.dtos.PersonajeDto;
import com.starwars.starwars.servicios.IPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class personajeController {

    @Autowired
    IPersonajeService personajeService;

    @PostMapping("/personajes")
    public ResponseEntity<List<PersonajeDto>> getPersonajes(@RequestBody String palabra) {
        System.out.println(palabra);
        List<PersonajeDto> personajeDtos = personajeService.buscarCoincidenciaEnNombre(palabra);
        return new ResponseEntity<>(personajeDtos, HttpStatus.OK);
    }

}
