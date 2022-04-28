package com.bootcamp.practicaStarWars.services;

import com.bootcamp.practicaStarWars.dto.PersonajeDTO;
import com.bootcamp.practicaStarWars.models.Personaje;
import com.bootcamp.practicaStarWars.repositorys.DAO;
import com.bootcamp.practicaStarWars.repositorys.PersonajeDaoImplements;

import java.util.ArrayList;
import java.util.List;

public class PersonajeService {

    PersonajeDaoImplements dao = new PersonajeDaoImplements();

    public List<PersonajeDTO> getPersonajesPorPalabra(String palabra) {

        List<PersonajeDTO> personajesDTO = new ArrayList<>();
        List<Personaje> personajes = dao.getElementsPorPalabra(palabra);

        personajes.forEach(personaje -> personajesDTO.add(new PersonajeDTO(personaje.getName())));

        return personajesDTO;
    }
}
