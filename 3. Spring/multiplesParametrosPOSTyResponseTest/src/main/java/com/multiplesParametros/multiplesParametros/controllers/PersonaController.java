package com.multiplesParametros.multiplesParametros.controllers;

import com.multiplesParametros.multiplesParametros.MultiplesParametrosApplication;
import com.multiplesParametros.multiplesParametros.modelo.Persona;
import com.multiplesParametros.multiplesParametros.servicios.PersonaServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@RestController
public class PersonaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MultiplesParametrosApplication.class);
    private PersonaServicio pServicio= new PersonaServicio();

    @GetMapping("/getPersona")
    public ResponseEntity<Persona> getPersona(){
        Persona p1= new Persona();
        p1.setApellido("Marcos");
        p1.setNombre("Valen");
        return new ResponseEntity<>(p1, HttpStatus.OK);
    }
    @GetMapping("/getPersonasFiltradas/{filtro}")
    public ResponseEntity<Stream<Persona>> getPersonasFiltradas(@PathVariable String filtro){
        return new ResponseEntity<>(pServicio.getPersonasFiltradas(filtro),HttpStatus.OK);
    }
    @GetMapping("/getPersonas")
    public ResponseEntity<List<Persona>> getPersonas(){
        return new ResponseEntity<>(pServicio.getPersonas(),HttpStatus.OK);
    }
    @PostMapping("/persona")
    public ResponseEntity<String> addPersona(@RequestBody Persona p1){
        LOGGER.info(p1.toString());
        pServicio.addPersona(p1);
        return new ResponseEntity<>("se agrego el registro exitosamente",HttpStatus.OK);
    }
    @GetMapping("/getSaludo")
    public String getSaludo(@RequestParam String nombre, @RequestParam String apellido){
        return ("Hola por get a "+ nombre + " " + apellido);
    }

}
