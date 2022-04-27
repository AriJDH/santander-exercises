package com.practica.C12P2Starwars.services;

import com.practica.C12P2Starwars.dtos.PersonajeDTO;
import com.practica.C12P2Starwars.models.Personaje;
import com.practica.C12P2Starwars.repo.Dao;
import com.practica.C12P2Starwars.repo.PersonajeDaoImplJson;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonajeService implements IPersonajeService{
    PersonajeDaoImplJson personajeDao = new PersonajeDaoImplJson();

    public List<PersonajeDTO> getPersonajesConNombre(String palabra) {
        List<Personaje> personajes_con_nombre = personajeDao.getElementos(palabra);

        //mapeo
        List<PersonajeDTO> personajes_dto = personajes_con_nombre.stream().map(
                p -> new PersonajeDTO(p.getName())
        ).collect(Collectors.toList());

        return personajes_dto;
    }
}
