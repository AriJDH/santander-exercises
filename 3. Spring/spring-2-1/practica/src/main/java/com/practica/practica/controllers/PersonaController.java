package com.practica.practica.controllers;

import com.practica.practica.modelo.Persona;
import com.practica.practica.servicios.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {

    PersonaService personaService = new PersonaService();

    @GetMapping("/getpersona")
    public Persona getPersona() {
        Persona persona = new Persona();
        persona.setNombre("Pedro");
        persona.setApellido("Gomez");
        return persona;
    }

    @GetMapping("/getpersonas")
    public List<Persona> getPersonas() {
        return personaService.getPersonas();
        /*
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan","Gomez"));
        personas.add(new Persona("Maria","Juarez"));
        return personas;
        */
    }


}
