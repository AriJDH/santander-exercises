package com.practica.C12P2Starwars.services;

import com.practica.C12P2Starwars.dtos.PersonajeDTO;

import java.util.List;

public interface IPersonajeService {

    List<PersonajeDTO> getPersonajesConNombre(String palabra);
}