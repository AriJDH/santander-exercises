package com.santander.C12P2EjercicioPracticoStarWars.servicio;



import com.santander.C12P2EjercicioPracticoStarWars.dto.PersonajeDto;

import java.util.List;

public interface IPersonajeService {

    public List<PersonajeDto> buscarCoincidenciaNombre(String palabra);
}
