package c11exercises.p2.ejercicioClase.controllers;

import c11exercises.p2.ejercicioClase.App;
import c11exercises.p2.ejercicioClase.dto.PersonDto;
import c11exercises.p2.ejercicioClase.models.Persona;
import c11exercises.p2.ejercicioClase.servicios.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
public class PersonaController {

    Logger LOGGER = LoggerFactory.getLogger(App.class);

    @Autowired
    PersonaService personaServicio; //= new PersonaService();

    @GetMapping("/getPersona")
    public PersonDto getPersona() {
        return personaServicio.getPersona();
    }

    @GetMapping("/getPersonas")
    public List<PersonDto> getPersonas() {

        return personaServicio.getPersonas();
    }

    @PostMapping("/createPersona")
    public ResponseEntity<String> agregar(@RequestBody PersonDto person) {
        LOGGER.info(String.valueOf(person));

        personaServicio.addPerson(person);

        return new ResponseEntity<>("Se agregé correctamente la persona", HttpStatus.OK);

    }

}
