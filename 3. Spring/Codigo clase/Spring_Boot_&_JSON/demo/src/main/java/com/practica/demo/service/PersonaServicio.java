package com.practica.demo.service;

import com.practica.demo.dao.Dao;
import com.practica.demo.dao.DaoPersonaImplementacion;
import com.practica.demo.modelo.Persona;

import java.util.List;

public class PersonaServicio {

    DaoPersonaImplementacion dao= new DaoPersonaImplementacion();

    public List<Persona> mostrarPersonas(){
        return dao.getElementos();
    }

    public Persona mostrarPersona(int index){
        return dao.buscarPorIndex(index);
    }

    public void agregar(Persona persona) {
        dao.agregar(persona);
    }
}
