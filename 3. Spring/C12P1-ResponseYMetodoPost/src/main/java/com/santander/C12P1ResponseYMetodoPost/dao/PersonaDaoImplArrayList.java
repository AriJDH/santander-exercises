package com.santander.C12P1ResponseYMetodoPost.dao;

import com.santander.C12P1ResponseYMetodoPost.modelo.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImplArrayList implements Dao<String,Persona>{

    private List<Persona> personas= new ArrayList<>();

    public PersonaDaoImplArrayList(){
        personas.add(new Persona("Carlos","Perez","78654378"));
        personas.add(new Persona("Carlos","Perez","6754367"));
        personas.add(new Persona("Carlos","Perez","67954345"));
    }

    @Override
    public List<Persona> getElementos(){
        return this.personas;
    }

    @Override
    public void agregar(Persona elemento) {

    }
}
