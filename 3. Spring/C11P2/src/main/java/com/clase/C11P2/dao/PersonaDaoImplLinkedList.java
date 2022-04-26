package com.clase.C11P2.dao;

import com.clase.C11P2.model.Persona;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class PersonaDaoImplLinkedList implements Dao<String, Persona>{

    private final List<Persona> personas;

    public PersonaDaoImplLinkedList() {
        this.personas = new LinkedList<>();
        personas.add(new Persona("38998262","Carlos", "Perez"));
        personas.add(new Persona("38998263", "Maria", "Juarez"));
        personas.add(new Persona("38998264", "Ramona", "Perez"));
    }

    @Override
    public List<Persona> getElementos() {
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
