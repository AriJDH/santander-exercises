package com.santander.EjercicioHechoEnClases.dao;

import com.santander.EjercicioHechoEnClases.modelo.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImplArrayList implements Dao<String,Persona>{

    private List<Persona> personas= new ArrayList<>();

    public PersonaDaoImplArrayList(){
        personas.add(new Persona("Carlos","Perez"));
        personas.add(new Persona("Carlos","Perez"));
        personas.add(new Persona("Carlos","Perez"));
    }

    @Override
    public List<Persona> getElementos(){
        return this.personas;
    }
}
