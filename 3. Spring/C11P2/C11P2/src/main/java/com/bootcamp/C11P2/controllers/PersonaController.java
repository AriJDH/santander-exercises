package com.bootcamp.C11P2.controllers;

import com.bootcamp.C11P2.models.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {

    @GetMapping(path = "getPersona")
    public Persona getPersona(){
        Persona persona = new Persona();
        persona.setApellido("Gomez");
        persona.setNombre("Juan");
        return persona;
    }

    @GetMapping(path = "getPersonas")
    public List<Persona> getPersonas(){
        List<Persona> listaDePersonas = new ArrayList<>();

        listaDePersonas.add(new Persona("Juan", "Gomez"));
        listaDePersonas.add(new Persona("Federico", "Sanchez"));

        return listaDePersonas;
    }

    // end point -> servicios

}
