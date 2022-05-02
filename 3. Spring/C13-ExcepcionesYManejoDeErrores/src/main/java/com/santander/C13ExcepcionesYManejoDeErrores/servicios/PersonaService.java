package com.santander.C13ExcepcionesYManejoDeErrores.servicios;

import com.santander.C13ExcepcionesYManejoDeErrores.dto.PersonaDto;
import com.santander.C13ExcepcionesYManejoDeErrores.exception.PersonaException;
import com.santander.C13ExcepcionesYManejoDeErrores.modelo.Persona;
import com.santander.C13ExcepcionesYManejoDeErrores.repo.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service(value = "PersonaService")
public class PersonaService implements IPersonaService{

    @Autowired
    @Qualifier("PersonaDaoImplArrayList")
    Dao personaDao;

    @Override
    public List<PersonaDto> getPersonas() {
        List<Persona> personas = personaDao.getElementos();
        List<PersonaDto> personasDto = personas.stream().map(
                p -> new PersonaDto(p.getNombre(),p.getApellido(),p.getFechaNacimiento())
        ).collect(Collectors.toList());
        return personasDto;
    }

    @Override
    public boolean enviarCorreo(Persona persona) {
        return true;
    }

    @Override
    public void agregar(PersonaDto personaDto) {
        Persona persona = new Persona();
        persona.setNombre(personaDto.getNombre());
        persona.setApellido(personaDto.getApellido());
        personaDao.agregar(persona);
    }

    @Override
    public PersonaDto getPersona() {
        PersonaDto persona = new PersonaDto();
        persona.setNombre("Pedro");
        persona.setApellido("Gomez");
        return persona;
    }

    @Override
    public PersonaDto getPersona(String nombre){
        List<Persona> personas = personaDao.getElementos();
        Persona persona = personas.stream().filter(p -> p.getNombre().equals(nombre)).findFirst().orElse(null);
        if (persona == null){
            throw new PersonaException("nombre invalido"+ nombre);
        }
        PersonaDto personaDto = new PersonaDto();
        personaDto.setNombre(persona.getNombre());
        personaDto.setApellido(persona.getApellido());
        personaDto.setFechaNacimiento(persona.getFechaNacimiento());
        return personaDto;
    }
}
