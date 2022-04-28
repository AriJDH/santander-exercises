package com.bootcamp.practicaStarWars.controllers;

import com.bootcamp.practicaStarWars.dto.PersonajeDTO;
import com.bootcamp.practicaStarWars.services.PersonajeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonajeController {

    PersonajeService service = new PersonajeService();

    @GetMapping(path = "getPersonajesPorPalabra/{palabra}")
    public List<PersonajeDTO> getPersonajesPorPalabra(@PathVariable String palabra){
        return service.getPersonajesPorPalabra(palabra);
    }
}
