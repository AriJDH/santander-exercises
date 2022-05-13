package com.ejercicio2.ejercicio2.controllers;

import com.ejercicio2.ejercicio2.dao.Dao;
import com.ejercicio2.ejercicio2.dto.PersonaDto;
import com.ejercicio2.ejercicio2.modelos.Persona;
import com.ejercicio2.ejercicio2.servicios.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonaController.class);

    @Autowired
    PersonaService personaService; // = new PersonaService();

    @GetMapping("/getpersona")
    public ResponseEntity<PersonaDto> getPersona(){
        return new ResponseEntity<>(personaService.getPersona(), HttpStatus.OK);
    }

    @GetMapping("/getpersonas")
    public ResponseEntity<List<PersonaDto>> getPersonas() {
        return new ResponseEntity<>(personaService.getPersonas(), HttpStatus.OK);
    }

    @PostMapping("/persona")
    public ResponseEntity<String> agregar(@RequestBody PersonaDto persona){
        LOGGER.info(persona.toString());
        personaService.agregar(persona);
        return new ResponseEntity<>("Se cargaron los datos correctamente" + persona, HttpStatus.OK);
    }

    /*@GetMapping("/getpersona")
    public Persona getPersona (){
        Persona persona = new Persona();
        persona.setNombre("Mario");
        persona.setApellido("Lopez");
        return persona;
    }*/

    /*@GetMapping("/getpersonas")
    public List<Persona> getPersonas(){

        return personaService.getPersonas();

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "Gomez"));
        personas.add(new Persona("Mariana", "Godoy"));
        personas.add(new Persona("Luciana", "Martinesz"));
        personas.add(new Persona("Martin", "Gimenez"));
        personas.add(new Persona("Nicolas", "CONte"));
        return personas;
    }*/

    //end point -> servicios

}
