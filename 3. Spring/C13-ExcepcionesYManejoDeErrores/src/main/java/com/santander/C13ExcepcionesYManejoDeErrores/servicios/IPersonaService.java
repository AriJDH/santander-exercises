package com.santander.C13ExcepcionesYManejoDeErrores.servicios;

import com.santander.C13ExcepcionesYManejoDeErrores.dto.PersonaDto;
import com.santander.C13ExcepcionesYManejoDeErrores.modelo.Persona;

import java.util.List;

public interface IPersonaService {
    public List<PersonaDto> getPersonas();

    public boolean enviarCorreo(Persona persona);

    public void agregar(PersonaDto persona);

    public PersonaDto getPersona();

    public PersonaDto getPersona(String nombre);
}
