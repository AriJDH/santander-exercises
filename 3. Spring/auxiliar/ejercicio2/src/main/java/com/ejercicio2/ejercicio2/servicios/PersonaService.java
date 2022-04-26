package com.ejercicio2.ejercicio2.servicios;

import com.ejercicio2.ejercicio2.dao.Dao;
import com.ejercicio2.ejercicio2.dao.PersonaDaoImplLinkedList;
import com.ejercicio2.ejercicio2.modelos.Persona;

import java.util.List;

public class PersonaService {
    Dao personaDao = new PersonaDaoImplLinkedList();

    public List<Persona> getPersonas() {
        return personaDao.getElementos();
    }

    public void agregar (Persona persona) {
        personaDao.agregar(persona);
    }

}
