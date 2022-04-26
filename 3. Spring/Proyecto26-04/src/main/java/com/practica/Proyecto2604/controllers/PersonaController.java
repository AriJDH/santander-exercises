package com.practica.Proyecto2604.controllers;

import com.practica.Proyecto2604.modelo.Persona;
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
        persona.setApellido("Ramirez");

        return persona;
    }
    @GetMapping("/getpersonas")
    public List<Persona> getPersonas(){
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "Caserez"));
        personas.add(new Persona("Maria", "Juarez"));
        personas.add(new Persona("Nicolas", "Fernandez"));
        return personas;
    }
    //end point->servicios

}
