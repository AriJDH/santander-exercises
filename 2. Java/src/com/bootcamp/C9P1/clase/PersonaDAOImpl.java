package com.bootcamp.C9P1.clase;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImpl implements DAO<Persona, String>{
    List<Persona> personas;

    public PersonaDAOImpl() {
        this.personas = new ArrayList<>();
    }

    public PersonaDAOImpl(List<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public Persona buscarElemento(String nombre) {
        Persona persona_retornada = null;
        for (Persona persona : personas) {
            if (persona.tiene_nombre(nombre)) {
                persona_retornada = persona;
            }
        }
        return persona_retornada;
    }

    @Override
    public void agregar(Persona persona) {
        personas.add(persona);
    }


    @Override
    public List<Persona> listar() {
        return personas;
    }
}
