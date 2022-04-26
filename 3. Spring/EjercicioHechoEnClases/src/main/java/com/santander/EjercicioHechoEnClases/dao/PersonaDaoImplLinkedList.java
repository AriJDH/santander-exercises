package com.santander.EjercicioHechoEnClases.dao;

import com.santander.EjercicioHechoEnClases.modelo.Persona;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PersonaDaoImplLinkedList implements Dao<String, Persona>{
    private List<Persona> personas= new LinkedList<>();

    public PersonaDaoImplLinkedList(){
        personas.add(new Persona("Carlos","Perez"));
        personas.add(new Persona("Carlos","Perez"));
        personas.add(new Persona("Carlos","Perez"));
    }

    @Override
    public List<Persona> getElementos(){
        return null;
    }
}
