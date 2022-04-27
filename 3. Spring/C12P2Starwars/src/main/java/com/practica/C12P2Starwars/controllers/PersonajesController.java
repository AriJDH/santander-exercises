package com.practica.C12P2Starwars.controllers;

import com.practica.C12P2Starwars.dtos.PersonajeDTO;
import com.practica.C12P2Starwars.services.PersonajeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonajesController {

    private PersonajeService personajeService = new PersonajeService();

    @GetMapping("/")
    public String home(){
        return "Estas en home";
    }

    @GetMapping("/personaje/{palabra}")
    public ResponseEntity<List<PersonajeDTO>> getPersonajes(@PathVariable String palabra){
        List<PersonajeDTO> personaje_dtos = personajeService.getPersonajesConNombre(palabra);
        return new ResponseEntity<>(personaje_dtos, HttpStatus.OK);
    }

}
