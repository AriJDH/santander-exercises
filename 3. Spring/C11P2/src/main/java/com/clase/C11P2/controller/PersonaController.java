package com.clase.C11P2.controller;

import com.clase.C11P2.model.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {

    @GetMapping("/getpersona")
    public Persona getPersona(){
        Persona persona = new Persona();
        persona.setNombre("Pedro");
        persona.setApellido("Gomez");

        /*Spring automagicamente convierte el objeto a formato JSON*/
        return persona;
    }

    @GetMapping("/getpersonas")
    public List<Persona> getPersonas(){
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "Gonez"));
        personas.add(new Persona("Maria", "Juarez"));

        return personas;
    }
}
