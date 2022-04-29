package com.santander.bootcamp.M4C12P2.controllers;

import com.santander.bootcamp.M4C12P2.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonajeController {

    @Autowired
    PersonajeService personajeService;

    @GetMapping("/buscarPersonaje")
    public ResponseEntity<List<String>> buscarPersonaje (@RequestParam String textoABuscar) {
        return new ResponseEntity<>(personajeService.buscarPersonaje(textoABuscar), HttpStatus.OK);
    }

}
