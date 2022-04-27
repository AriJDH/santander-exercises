package com.santander.C13ExcepcionesEjercicioStarWars.servicio;

import com.santander.C13ExcepcionesEjercicioStarWars.dto.PersonajeDto;
import com.santander.C13ExcepcionesEjercicioStarWars.modelos.Personaje;
import com.santander.C13ExcepcionesEjercicioStarWars.repo.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonajeService implements IPersonajeService{

    @Autowired
    Dao personajeDao;


    @Override
    public List<PersonajeDto> buscarCoincidenciaNombre(String palabra) {
        List<Personaje> personajes = personajeDao.getElementos(palabra);
        List<PersonajeDto> personajeDtos = personajes.stream().map(
                p -> new PersonajeDto(p.getName())
        ).collect(Collectors.toList());
        return personajeDtos;
    }
}
