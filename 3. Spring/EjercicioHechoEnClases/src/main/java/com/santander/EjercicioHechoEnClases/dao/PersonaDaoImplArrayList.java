package com.santander.EjercicioHechoEnClases.dao;

import com.santander.EjercicioHechoEnClases.modelo.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImplArrayList implements Dao<String,Persona>{

    private final List<Persona> personas;

    public PersonaDaoImplArrayList(){
        this.personas = new ArrayList<>();
        personas.add(new Persona("Carlos", "Perez","64859536"));
        personas.add(new Persona("Maria", "Juarez","4763849"));
        personas.add(new Persona("Ramona", "Perez","34787459"));
    }

    @Override
    public List<Persona> getElementos(){
        return this.personas;
    }

    @Override
    public Persona getElementoPorId(String clave) {
        return null;
    }
}
