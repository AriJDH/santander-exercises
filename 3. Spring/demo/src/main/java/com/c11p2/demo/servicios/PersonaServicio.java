package com.c11p2.demo.servicios;

import com.c11p2.demo.dao.Dao;
import com.c11p2.demo.dao.PersonaDao;
import com.c11p2.demo.modelos.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaServicio {

    // llamar a implementacion dao

    public List<Persona> personas = new ArrayList<>();

    Dao personaDao = new PersonaDao();

    public List getPersonas(){
        return personaDao.getElementos();
    }


    public void agregar(Persona persona) {
        personaDao.agregar(persona);
    }
}
