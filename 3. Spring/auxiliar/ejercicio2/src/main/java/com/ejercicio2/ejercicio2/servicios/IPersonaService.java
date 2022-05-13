package com.ejercicio2.ejercicio2.servicios;

import com.ejercicio2.ejercicio2.dao.Dao;
import com.ejercicio2.ejercicio2.dao.PersonaDaoImplLinkedList;
import com.ejercicio2.ejercicio2.dto.PersonaDto;
import com.ejercicio2.ejercicio2.modelos.Persona;

import java.util.List;

public interface IPersonaService {

    Dao personaDao = new PersonaDaoImplLinkedList();

    public List<PersonaDto> getPersonas();

    public void agregar(PersonaDto persona);

    public PersonaDto getPersona();

}
