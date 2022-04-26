package com.practica.practica.servicios;

import com.practica.practica.dao.Dao;
import com.practica.practica.dao.PersonaDaoImplArrayList;
import com.practica.practica.dao.PersonaDaoImplLinkedList;
import com.practica.practica.modelo.Persona;

import java.util.List;

public class PersonaService {

    public List<Persona> getPersonas() {

        // consultar un texto
        // consultar otra api
        // recibir un correo
        // hacer calculos

        Dao personaDao = new PersonaDaoImplArrayList();
        return personaDao.getElementos();

    }

    // enviar correo electronico
    public boolean enviarCorreo(Persona persona) {
        // obtengo datos de dao.getpersona
        // envio correo
        return true;
    }

}
