package c11exercises.p2.ejercicioClase.controllers;

import c11exercises.p2.ejercicioClase.App;
import c11exercises.p2.ejercicioClase.models.Persona;
import c11exercises.p2.ejercicioClase.servicios.PersonaServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
public class PersonaController {

    Logger LOGGER = LoggerFactory.getLogger(App.class);
    PersonaServicio personaServicio = new PersonaServicio();

    @GetMapping("/getPersona")
    public Persona getPersona() {
        Persona persona = new Persona();
        persona.setName("asd");
        persona.setLastname("Aaa");

        return persona;
    }

    @GetMapping("/getPersonas")
    public List<Persona> getPersonas() {

        return personaServicio.getPersonas();
    }

    @PostMapping("/createPersona")
    public ResponseEntity<String> agregar(@RequestBody Persona person) {
        LOGGER.info(String.valueOf(person));

        personaServicio.addPerson(person);

        return new ResponseEntity<>("Se agregé correctamente la persona", HttpStatus.OK);

    }

}
