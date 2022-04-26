package com.practica.Proyecto2604.dao;

import com.practica.Proyecto2604.modelo.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImplArrayList implements Dao<String,Persona>{

    private List<Persona> personas = new ArrayList<>();

    public PersonaDaoImplArrayList(){
        personas.add(new Persona("Carlos", "Perez"));
        personas.add(new Persona("Maria", "Juarez"));
        personas.add(new Persona("Ramona", "Flowers"));
    }

    @Override
    public List<Persona> getElementos() {
        return this.personas;
    }
}
