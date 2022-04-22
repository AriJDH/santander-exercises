package com.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImpl implements DAO<Persona,String>{

    ArrayList<Persona> personas = new ArrayList<>();

    @Override
    public Persona buscarElemento(String key) {
        return null;
    }

    @Override
    public List<Persona> listar() {
        return this.personas;
    }

    @Override
    public void agregar(Persona elemento) {
        this.personas.add(elemento);
    }
}
