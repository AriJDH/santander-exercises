package com.practica.demo.dao;

import com.practica.demo.modelo.Persona;

import java.util.ArrayList;
import java.util.List;


//@Repository para aplicar a cada dao.

public class DaoPersonaImplementacion implements Dao<String, Persona>{

    private List<Persona> personaList=new ArrayList<>();

    public DaoPersonaImplementacion() {
        personaList.add(new Persona("Lucas","Gomez"));
        personaList.add(new Persona("Pedro","Gomez"));
        personaList.add(new Persona("Tito","Gomez"));
    }

    @Override
    public List<Persona> getElementos() {

        return personaList;
    }

    @Override
    public Persona buscarPorIndex(int index) {
        return personaList.get(index);
    }

    @Override
    public Persona buscarPorNombre(String nombre) {
        for (Persona persona :
                personaList) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                return persona;
            }
            }
        return null;
    }

    public void agregar(Persona persona) {
        personaList.add(persona);
    }
}
