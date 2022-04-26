package com.bootcamp.C11P2.dao;

import com.bootcamp.C11P2.models.Persona;

import java.util.LinkedList;
import java.util.List;

public class DaoPersonaImplLinkList implements Dao<String, Persona>{

    private List<Persona> personas = new LinkedList<>();

    public DaoPersonaImplLinkList(){
        personas.add(new Persona("Juan", "Perez"));
        personas.add(new Persona("Maria", "Juarez"));
        personas.add(new Persona("Federico", "Sanchez"));

    }

    @Override
    public List<Persona> getElements() {
        return this.personas;
    }
}

