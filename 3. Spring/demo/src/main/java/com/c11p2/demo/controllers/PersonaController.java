package com.c11p2.demo.controllers;

import com.c11p2.demo.modelos.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.c11p2.demo.DemoApplication.LOGGER;


@RestController
public class PersonaController {

    @GetMapping("/getpersona")
    public ResponseEntity<Persona> getPersona(){
        Persona persona = new Persona();
        persona.setApellido("yyy");
        persona.setNombre("xxx");
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @PostMapping("/persona")
    public ResponseEntity<String> agregar(@RequestBody Persona persona){

        return new ResponseEntity<>("Se agrego con exito a : " + persona.toString(), HttpStatus.OK);
    }
}
