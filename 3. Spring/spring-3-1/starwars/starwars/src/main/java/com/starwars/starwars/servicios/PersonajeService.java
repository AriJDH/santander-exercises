package com.starwars.starwars.servicios;

import com.starwars.starwars.dtos.PersonajeDto;
import com.starwars.starwars.models.Personaje;
import com.starwars.starwars.repo.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonajeService implements IPersonajeService{

    @Autowired
    Dao personajeDao;

    @Override
    public List<PersonajeDto> buscarCoincidenciaEnNombre(String palabra) {
        List<Personaje> personajes = personajeDao.getElementos(palabra);
        List<PersonajeDto> personajeDtos = personajes.stream().map(
                p -> new PersonajeDto(p.getName())
        ).collect(Collectors.toList());
        return personajeDtos;
    }
}
