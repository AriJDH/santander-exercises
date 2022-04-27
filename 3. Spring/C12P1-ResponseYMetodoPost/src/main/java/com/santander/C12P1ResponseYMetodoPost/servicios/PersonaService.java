package com.santander.C12P1ResponseYMetodoPost.servicios;

import com.santander.C12P1ResponseYMetodoPost.dao.Dao;
import com.santander.C12P1ResponseYMetodoPost.dao.PersonaDaoImplArrayList;
import com.santander.C12P1ResponseYMetodoPost.modelo.Persona;

import java.util.List;

public class PersonaService {

    Dao personaDao = new PersonaDaoImplArrayList();

    public List<Persona> getPersonas() {
        //consultar un texto
        //consultar otra API
        //recibir un correo
        //Hacer algunos calculos

        //Dao personaDao = new PersonaDaoImplLinkedList();
        //return personaDao.getElementos();

        return personaDao.getElementos();
    }

    //enviar correo
    public boolean enviar_correo(Persona persona){
        //obtengo datos de dao.getpersona
        //enviar correo
        return true;
    }
    //ultimo cambio
    public void agregar(Persona persona){
        personaDao.agregar(persona);
    }
}
