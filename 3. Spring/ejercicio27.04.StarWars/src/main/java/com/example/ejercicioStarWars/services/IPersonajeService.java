package com.example.ejercicioStarWars.services;

import com.example.ejercicioStarWars.dtos.PersonajeDto;

import java.util.List;

public interface IPersonajeService {

    public List<PersonajeDto> findConcidencia(String palabra);
}
