package com.santander.practica_json.controllers;

import com.santander.practica_json.modelo.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {
    @GetMapping("/getpersona")
    public Persona getPersona() {
        Persona persona = new Persona();
        persona.setNombre("Pedro");
        persona.setApellido("Lopez");
        return persona;
    }

    @GetMapping("/getpersonas")
    public List<Persona> getPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "Andres"));
        personas.add(new Persona("Maria", "Becerra"));
        return personas;
    }
}
