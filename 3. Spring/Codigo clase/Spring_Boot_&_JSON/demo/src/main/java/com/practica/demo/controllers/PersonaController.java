package com.practica.demo.controllers;


import com.practica.demo.DemoApplication;
import com.practica.demo.dao.DaoPersonaImplementacion;
import com.practica.demo.modelo.Persona;
import com.practica.demo.service.PersonaServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);


    PersonaServicio personaServicio = new PersonaServicio();


    @GetMapping("/getPersonaObjeto")
    public ResponseEntity<Persona> getPersonaObjeto() {
        Persona persona = new Persona("Pedro", "Gomez");
        return new ResponseEntity<>(persona, HttpStatus.ACCEPTED);
        //Estos mensajes de http status luego los pickean los del front.
    }


    @GetMapping("/getPersona")
    public Persona getPersona() {
        Persona persona = new Persona("Pedro", "Gomez");
        return persona;
    }

    @GetMapping("/getPersonas")
    public List<Persona> getPersonas() {
        Persona persona = new Persona("Pedro", "Gomez");
        Persona persona1 = new Persona("Camila", "Gomez");
        Persona persona2 = new Persona("Roberto", "Gomez");

        List<Persona> personas = new ArrayList<>();
        personas.add(persona);
        personas.add(persona1);
        personas.add(persona2);


        return personas;
    }


    //un post y un get pueden tener el mismo path
    //Vas a postman, metodo post y pones localhost:8080/agregar
    //luego en body haces la estructura JSON de los datos (en este caso Persona)
    @PostMapping("/agregar")
    public ResponseEntity<String> agregar(@RequestBody Persona persona){
        LOGGER.info("Hola "+ persona);
        personaServicio.agregar(persona);
        return new ResponseEntity<>("Se agrego el registro con exito",HttpStatus.ACCEPTED);

    }

    @GetMapping (path = "/mostrarPersonasObjeto")
    public ResponseEntity<List<Persona>> mostrarPersonasObjeto(){


        return new ResponseEntity<>(personaServicio.mostrarPersonas(),HttpStatus.ACCEPTED);
    }
    /*
    llamar a una clase de servicios desde un end point
     */

    @GetMapping (path = "/mostrarPersonas")
    public List<Persona> mostrarPersonas(){


        return personaServicio.mostrarPersonas();
    }

    //mostrarPersona por index
    @GetMapping (path = "/mostrarPersonas/{id}")
    public Persona mostrarPersonas(@PathVariable int id){


        return personaServicio.mostrarPersona(id);
    }

}
