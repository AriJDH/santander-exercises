package com.ejercicio2.ejercicio2.servicios;

import com.ejercicio2.ejercicio2.dao.Dao;
import com.ejercicio2.ejercicio2.dao.PersonaDaoImplLinkedList;
import com.ejercicio2.ejercicio2.modelos.Persona;

import java.util.List;

public class PersonaService {

    public List<Persona> getPersonas() {
        Dao personaDao = new PersonaDaoImplLinkedList();
        return personaDao.getElementos();
    }

}
