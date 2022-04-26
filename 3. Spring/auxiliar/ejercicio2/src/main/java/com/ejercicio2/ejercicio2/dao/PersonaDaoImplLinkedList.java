package com.ejercicio2.ejercicio2.dao;

import com.ejercicio2.ejercicio2.modelos.Persona;

import java.util.LinkedList;
import java.util.List;

public class PersonaDaoImplLinkedList implements Dao<String, Persona> {

    public List<Persona> personas = new LinkedList<>();

    public PersonaDaoImplLinkedList() {
        personas.add(new Persona("Carlos", "Perez"));
        personas.add(new Persona("Marcela", "Lopez"));
        personas.add(new Persona("Julia", "Juanes"));
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
