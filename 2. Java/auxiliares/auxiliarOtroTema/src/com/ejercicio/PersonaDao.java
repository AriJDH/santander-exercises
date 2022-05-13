package com.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class PersonaDao implements Dao<Persona, String>{

    ArrayList<Persona> personas = new ArrayList<>();

    @Override
    public Persona buscarElemento(String key) {
        return null;
    }

    @Override
    public List<Persona> lsitar() {
        return this.personas;
    }

    @Override
    public void agregar(Persona elemento) {
        personas.add(elemento);
    }
}
