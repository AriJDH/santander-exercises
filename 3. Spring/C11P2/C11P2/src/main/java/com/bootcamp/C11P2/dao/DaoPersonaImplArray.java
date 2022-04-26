package com.bootcamp.C11P2.dao;

import com.bootcamp.C11P2.models.Persona;

import java.util.ArrayList;
import java.util.List;

public class DaoPersonaImplArray implements Dao<String, Persona> {

    private List<Persona> personas = new ArrayList<>();

    public DaoPersonaImplArray(){
        personas.add(new Persona("Juan", "Perez"));
        personas.add(new Persona("Maria", "Juarez"));
        personas.add(new Persona("Federico", "Sanchez"));

    }

    @Override
    public List<Persona> getElements() {
        return this.personas;
    }
}
