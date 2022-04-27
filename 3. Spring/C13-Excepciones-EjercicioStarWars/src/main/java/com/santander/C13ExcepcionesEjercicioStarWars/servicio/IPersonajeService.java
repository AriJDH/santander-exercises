package com.santander.C13ExcepcionesEjercicioStarWars.servicio;

import com.santander.C13ExcepcionesEjercicioStarWars.dto.PersonajeDto;
import com.santander.C13ExcepcionesEjercicioStarWars.modelos.Personaje;

import java.util.List;

public interface IPersonajeService {

    public List<PersonajeDto> buscarCoincidenciaNombre(String palabra);
}
