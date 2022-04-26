package com.clase.C11P2.services;

import com.clase.C11P2.dao.Dao;
import com.clase.C11P2.dao.PersonaDaoImplArrayList;
import com.clase.C11P2.dao.PersonaDaoImplLinkedList;
import com.clase.C11P2.model.Persona;

import java.util.List;

public class PersonaServicio {
    public List<Persona> getPersonas(){

        Dao<String, Persona> personaDao = new PersonaDaoImplLinkedList();
        //Dao<String, Persona> personaDao = new PersonaDaoImplArrayList();

        // tomamos datos de la capa dao

        // le hacemos cosas...
            // consultar un texto
            // consultar otra api
            // recibir un correo
            // hacer calculos

        // devolvemos otra lista con los datos transformados
        return personaDao.getElementos();
    }

    public Persona getPersonaPorDni(String dni){
        Dao<String, Persona> personaDao = new PersonaDaoImplLinkedList();

        return personaDao.getElementoPorId(dni);
    }
}
