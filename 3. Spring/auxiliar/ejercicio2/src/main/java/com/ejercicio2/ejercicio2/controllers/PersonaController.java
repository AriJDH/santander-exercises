package com.ejercicio2.ejercicio2.controllers;

import com.ejercicio2.ejercicio2.dao.Dao;
import com.ejercicio2.ejercicio2.modelos.Persona;
import com.ejercicio2.ejercicio2.servicios.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {

    PersonaService personaService = new PersonaService();

    @GetMapping("/getpersona")
    public Persona getPersona (){
        Persona persona = new Persona();
        persona.setNombre("Mario");
        persona.setApellido("Lopez");
        return persona;
    }

    @GetMapping("/getpersonas")
    public List<Persona> getPersonas(){

        return personaService.getPersonas();

        /*List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "Gomez"));
        personas.add(new Persona("Mariana", "Godoy"));
        personas.add(new Persona("Luciana", "Martinesz"));
        personas.add(new Persona("Martin", "Gimenez"));
        personas.add(new Persona("Nicolas", "CONte"));
        return personas;*/
    }

    //end point -> servicios

}
