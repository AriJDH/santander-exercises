package com.practica.practica.servicios;

import com.practica.practica.dtos.PersonaDto;
import com.practica.practica.exception.PersonaNoSeEncuentraException;
import com.practica.practica.repo.Dao;
import com.practica.practica.repo.PersonaDaoImplArrayList;
import com.practica.practica.modelo.Persona;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    @Qualifier("PersonaDaoImplJson")
    Dao personaDao; //  = new PersonaDaoImplArrayList();

    public List<PersonaDto> getPersonas() {
    List<Persona> personas = personaDao.getElementos();
        List<PersonaDto> personasDto = personas.stream().map(
                p -> new PersonaDto(p.getNombre(),p.getApellido(),p.getFechaNacimiento())
        ).collect(Collectors.toList());
        return personasDto;
    }

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
    public PersonaDto getPersona(String nombre) {
        //WARNING!!!!! deberia estar en DAO, devolver todos los elementos de la base de datos es una guasada
        List<Persona> personas = personaDao.getElementos();
        Persona persona = personas.stream().filter(p -> p.getNombre().equals(nombre)).findFirst().orElse(null);
        if(persona == null){
            throw new PersonaNoSeEncuentraException("No se encuentra registro de personas");
        }
        //

        PersonaDto personaDto = new PersonaDto(persona.getNombre(), persona.getApellido(), persona.getFechaNacimiento());
        return personaDto;
    }

}
