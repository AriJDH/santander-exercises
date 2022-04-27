package com.santander.C12P2EjercicioPracticoStarWars.controller;


import com.santander.C12P2EjercicioPracticoStarWars.dto.PersonajeDto;
import com.santander.C12P2EjercicioPracticoStarWars.servicio.IPersonajeService;
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
        List<PersonajeDto> personajeDtos = personajeService.buscarCoincidenciaNombre(palabra);
        return new ResponseEntity<>(personajeDtos, HttpStatus.OK);
    }
}
