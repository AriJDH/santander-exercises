package com.santander.bootcamp.M4C12P2.services;

import com.santander.bootcamp.M4C12P2.repositories.PersonajeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeService {

    @Autowired
    PersonajeDAO personajeDAO;

    public List<String> buscarPersonaje (String textABuscar) {
        return personajeDAO.buscarPersonaje(textABuscar);
    }

}
