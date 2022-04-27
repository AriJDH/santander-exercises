package com.ejercicio2.Ejercicio2.service;

import com.ejercicio2.Ejercicio2.dto.PersonajeDTO;
import com.ejercicio2.Ejercicio2.models.Personaje;
import com.ejercicio2.Ejercicio2.repository.Dao;
import com.ejercicio2.Ejercicio2.repository.StarWarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StarWarService {
    @Autowired
    @Qualifier("StarWarDao")
    StarWarDao starWarDao;
    public List<PersonajeDTO> buscarPersonaje(String nombre) {
        
        List<Personaje> listaPersonaje= starWarDao.buscarPersonaje(nombre);
        List<PersonajeDTO>listaPersonajeDTO = null;

        for (Personaje personaje :
                listaPersonaje) {
            listaPersonajeDTO.add(new PersonajeDTO(personaje.getName()));
        }
        return listaPersonajeDTO;
    }
}
