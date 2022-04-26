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

        //Dao personaDao = new PersonaDaoImplLinkedList();
        //return personaDao.getElementos();

        Dao personaDao = new PersonaDaoImplArrayList();
        return personaDao.getElementos();
    }

    //enviar correo
    public boolean enviar_correo(Persona persona){
        //obtengo datos de dao.getpersona
        //enviar correo
        return true;
    }
}
