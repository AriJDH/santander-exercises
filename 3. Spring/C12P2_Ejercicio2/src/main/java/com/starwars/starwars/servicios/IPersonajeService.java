package com.starwars.starwars.servicios;

import com.starwars.starwars.dtos.PersonajeDto;

import java.util.List;


public interface IPersonajeService {

    public List<PersonajeDto> buscarCoincidenciaEnNombre(String palabra);

}
