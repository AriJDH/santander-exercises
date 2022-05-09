package com.c11p2.demo.dao;

import com.c11p2.demo.modelos.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDao implements Dao<String, Persona>{

    private List<Persona> personas = new ArrayList<>();

    public PersonaDao() {
        personas.add(new Persona("Carlos", "Perez"));
        personas.add(new Persona("Carlos2", "Perez2"));
        personas.add(new Persona("Carlos3", "Perez3"));

    }

    @Override
    public List<Persona> getElementos() {
        return this.personas;
    }

    @Override
    public void agregar(Persona elemento) {
        personas.add(elemento);
    }
}
