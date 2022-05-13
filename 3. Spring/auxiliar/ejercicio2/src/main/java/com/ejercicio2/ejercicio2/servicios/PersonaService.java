package com.ejercicio2.ejercicio2.servicios;

import com.ejercicio2.ejercicio2.dao.Dao;
import com.ejercicio2.ejercicio2.dao.PersonaDaoImplLinkedList;
import com.ejercicio2.ejercicio2.dto.PersonaDto;
import com.ejercicio2.ejercicio2.modelos.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    Dao personaDao; //= new PersonaDaoImplLinkedList();

    public List<PersonaDto> getPersonas() {
        List<Persona> persona = personaDao.getElementos();
        List<PersonaDto> personaDto = persona.stream().map( p -> new PersonaDto(p.getNombre(), p.getApellido(), p.getFechaNacimiento())).collect(Collectors.toList());
        return personaDto;
    }

    public void agregar (PersonaDto personaDto) {
        Persona persona = new Persona();
        persona.setNombre(personaDto.getNombre());
        persona.setApellido(personaDto.getApellido());
        persona.setFechaNacimiento(personaDto.getFechaNacimiento());
        personaDao.agregar(persona);
    }

    @Override
    public PersonaDto getPersona() {
        PersonaDto persona = new PersonaDto();
        persona.setNombre("Mario");
        persona.setApellido("Lopez");
        return persona;
    }

}
