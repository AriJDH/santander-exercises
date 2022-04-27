package com.practica.practica.controllers;

import com.practica.practica.dtos.ErrorDto;
import com.practica.practica.dtos.PersonaDto;
import com.practica.practica.exception.PersonaException;
import com.practica.practica.modelo.Persona;
import com.practica.practica.servicios.IPersonaService;
import com.practica.practica.servicios.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonaController.class);
    @Autowired
    IPersonaService personaService;

    @GetMapping("/getpersona")
    public ResponseEntity<PersonaDto>  getPersona() {
        return new ResponseEntity<>(personaService.getPersona(), HttpStatus.OK);
    }
    @GetMapping("/getpersonabyname/{name}")
    public ResponseEntity<PersonaDto>  getPersona(@PathVariable String name) {
        return new ResponseEntity<>(personaService.getPersona(name), HttpStatus.OK);
    }
    @GetMapping("/getpersonas")
    public ResponseEntity<List<PersonaDto>> getPersonas() {
        return new ResponseEntity<>(personaService.getPersonas(),HttpStatus.OK);
    }

    @PostMapping("/persona")
    public ResponseEntity<String> agregar(@RequestBody PersonaDto persona) {
        LOGGER.info(persona.toString());
        personaService.agregar(persona);
        return new ResponseEntity<>("Se agregó el registro con éxito", HttpStatus.OK);
    }

}
