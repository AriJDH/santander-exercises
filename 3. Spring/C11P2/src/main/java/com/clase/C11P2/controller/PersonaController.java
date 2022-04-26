package com.clase.C11P2.controller;

import com.clase.C11P2.model.Persona;
import com.clase.C11P2.services.PersonaServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {

    private final PersonaServicio personaServicio = new PersonaServicio();


    @GetMapping("/getpersona")
    public Persona getPersona(){
        Persona persona = new Persona();
        persona.setNombre("Pedro");
        persona.setApellido("Gomez");

        /*Spring automagicamente convierte el objeto a formato JSON*/
        return persona;
    }

    /*
    @GetMapping("/getpersonas")
    public List<Persona> getPersonas(){
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "Gonez"));
        personas.add(new Persona("Maria", "Juarez"));

        return personas;
    }
    */

    // desde el controller llamamos a la capa servicio
    // desde el servicio llamamos a la capa dao/repositorio
    @GetMapping("/getpersonas")
    public List<Persona> getServicioPersonas(){
        return personaServicio.getPersonas();
    }
}
