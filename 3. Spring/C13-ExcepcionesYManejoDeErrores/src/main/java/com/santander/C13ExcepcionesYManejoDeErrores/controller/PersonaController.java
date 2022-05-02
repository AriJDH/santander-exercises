package com.santander.C13ExcepcionesYManejoDeErrores.controller;

import com.santander.C13ExcepcionesYManejoDeErrores.dto.PersonaDto;
import com.santander.C13ExcepcionesYManejoDeErrores.servicios.IPersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonaController.class);

    @Autowired
    @Qualifier("PersonaService")
    IPersonaService personaService;

    //Recibo un nombre y devuelvo todos sus datos
    @GetMapping("/getpersonapornombre/{nombre}")
    public ResponseEntity<PersonaDto>  getPersona(@PathVariable String nombre) {
        return new ResponseEntity<>(personaService.getPersona(nombre), HttpStatus.OK);
    }

    //No recibo nada y devuelvo directamente todas las personas
    @GetMapping("/getpersona")
    public ResponseEntity<PersonaDto>  getPersona() {
        return new ResponseEntity<>(personaService.getPersona(), HttpStatus.OK);
    }


    @GetMapping("/getpersonas")
    public ResponseEntity<List<PersonaDto>> getPersonas() {
        return new ResponseEntity<>(personaService.getPersonas(),HttpStatus.OK);
    }

    @PostMapping("/persona")
    public ResponseEntity<String> agregar(@RequestBody PersonaDto personaDto) {
        LOGGER.info(personaDto.toString());
        personaService.agregar(personaDto);
        return new ResponseEntity<>("Se agregó el registro con éxito", HttpStatus.OK);
    }
}
