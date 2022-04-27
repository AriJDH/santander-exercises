package com.practica.practica.servicios;

import com.practica.practica.dtos.PersonaDto;
import com.practica.practica.modelo.Persona;

import java.util.List;

public interface IPersonaService {
    public List<PersonaDto> getPersonas();

    public boolean enviarCorreo(Persona persona);

    public void agregar(PersonaDto persona);

    public PersonaDto getPersona();

    public PersonaDto getPersona(String nombre);
}
