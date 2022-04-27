package com.santander.EjercicioHechoEnClases.dao;

import com.santander.EjercicioHechoEnClases.modelo.Persona;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

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
    public Persona getElementoPorId(String clave) {
        Persona persona_encontrada = null;
        if(personas.stream().anyMatch(persona -> Objects.equals(persona.getDni(), clave))){
            persona_encontrada = personas.stream().filter(persona -> Objects.equals(persona.getDni(), clave)).findFirst().get();
        }
        return persona_encontrada;
    }


}
