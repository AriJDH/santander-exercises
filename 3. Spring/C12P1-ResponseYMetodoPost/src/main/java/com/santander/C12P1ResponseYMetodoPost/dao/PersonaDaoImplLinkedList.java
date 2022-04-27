package com.santander.C12P1ResponseYMetodoPost.dao;

import com.santander.C12P1ResponseYMetodoPost.modelo.Persona;

import java.util.LinkedList;
import java.util.List;

public class PersonaDaoImplLinkedList implements Dao<String, Persona>{
    private final List<Persona> personas= new LinkedList<>();

    public PersonaDaoImplLinkedList(){
        personas.add(new Persona("Carlos","Perez","76489323"));
        personas.add(new Persona("Maria","Juarez","34789653"));
        personas.add(new Persona("Carlos","Perez","38654238"));
    }

    @Override
    public List<Persona> getElementos(){
        return this.personas;
    }

    @Override
    public void agregar(Persona elemento) {

    }
}
