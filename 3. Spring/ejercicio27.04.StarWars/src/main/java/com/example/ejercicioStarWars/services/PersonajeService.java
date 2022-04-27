package com.example.ejercicioStarWars.services;

import com.example.ejercicioStarWars.dtos.PersonajeDto;
import com.example.ejercicioStarWars.models.Personaje;
import com.example.ejercicioStarWars.repository.IPersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonajeService implements IPersonajeService{

    @Autowired
    IPersonajeRepository personajeRepository;




    @Override
    public List<PersonajeDto> findConcidencia(String palabra) {

        List<Personaje> personajes = personajeRepository.getElementos(palabra);
        List<PersonajeDto> personajeDtos = personajes.stream().map(
                p -> new PersonajeDto(p.getName())
        ).collect(Collectors.toList());
        return personajeDtos;
    }
}
