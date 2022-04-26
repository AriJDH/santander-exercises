package com.practica.practica.dao;

import com.practica.practica.modelo.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImplArrayList implements Dao<String, Persona>{

    private List<Persona> personas = new ArrayList<>();

    public PersonaDaoImplArrayList() {
        personas.add(new Persona("Carlos","Perez"));
        personas.add(new Persona("Maria","Juarez"));
        personas.add(new Persona("Ramona","Gomez"));

    }

    @Override
    public List<Persona> getElementos() {
        return this.personas;
    }
}
