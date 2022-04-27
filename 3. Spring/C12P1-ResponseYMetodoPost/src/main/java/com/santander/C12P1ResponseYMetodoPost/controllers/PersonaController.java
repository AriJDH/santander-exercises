package com.santander.C12P1ResponseYMetodoPost.controllers;

import com.santander.C12P1ResponseYMetodoPost.modelo.Persona;
import com.santander.C12P1ResponseYMetodoPost.servicios.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaController {

    Logger LOGGER = LoggerFactory.getLogger(PersonaController.class);
    private final PersonaService personaService = new PersonaService();

    @GetMapping("/getpersona")
    public ResponseEntity<Persona> getPersona() { //se modifico para DTO y response entity
        Persona persona = new Persona();
        persona.setNombre("Pedro");
        persona.setApellido("Gomez");
        return new ResponseEntity<>(persona, HttpStatus.OK); //response entity ejemplo
    }

    @GetMapping("/getpersonas")
    public ResponseEntity<List<Persona>> getPersonas(){
        return new ResponseEntity<>(personaService.getPersonas(),HttpStatus.OK);
    }

    @PostMapping("/persona") //Postman
    public ResponseEntity<String> agregar(@RequestBody Persona persona){
        LOGGER.info(persona.toString());
        personaService.agregar(persona);
        return new ResponseEntity<>("Se agrego con éxito",HttpStatus.OK);
    }

    /*@GetMapping("/getpersonas")
    public List<Persona> getPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan","Gomez"));
        personas.add(new Persona("Maria","Juarez"));
        return personas;
        return personaService.getPersonas();
    }*/

    //Primero llamo a una clase que etse en una capa de servicio
    //LLamo PersonServicios: que devuelva una lista de personas
    //De servicios instaciar una implementacion de Dao en una arrayList. Dao dao= new DaoPersonaImpl()
/*
    @GetMapping("/getpersonas")
    public List<Persona> getServicioPersonas(){
        return personaServicio.getPersona();
    }

    @GetMapping("/personas/{dni}")
    public Persona getPersonaDni(@PathVariable String dni){
        return personaServicio.getPersonaPorDni(dni);
    }*/
}
