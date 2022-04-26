package com.clase.C11P2.dao;

import com.clase.C11P2.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImplArrayList implements Dao<String, Persona>{

    private final List<Persona> personas;

    public PersonaDaoImplArrayList() {
        this.personas = new ArrayList<>();
        personas.add(new Persona("Carlos", "Perez"));
        personas.add(new Persona("Maria", "Juarez"));
        personas.add(new Persona("Ramona", "Perez"));
    }

    @Override
    public List<Persona> getElementos() {
        return this.personas;
    }
}
