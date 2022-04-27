package com.santander.EjercicioHechoEnClases.servicios;

import com.santander.EjercicioHechoEnClases.dao.Dao;
import com.santander.EjercicioHechoEnClases.dao.PersonaDaoImplArrayList;
import com.santander.EjercicioHechoEnClases.dao.PersonaDaoImplLinkedList;
import com.santander.EjercicioHechoEnClases.modelo.Persona;

import java.util.List;

public class PersonaService {

    public List<Persona> getPersonas() {
        //consultar un texto
        //consultar otra API
        //recibir un correo
        //Hacer algunos calculos

        Dao<String,Persona> personaDao = new PersonaDaoImplLinkedList();
        //Dao<String,Persona> personaDao = new PersonaDaoImplArrayList();
        return personaDao.getElementos();
    }

    public Persona getPersonaPorDNI(String dni) {
        Dao<String, Persona> personaDao = new PersonaDaoImplLinkedList();
        return personaDao.getElementoPorId(dni);
    }

}
