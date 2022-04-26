package com.spring.demo.controllers.DAO;

import com.spring.demo.Modelos.Persona;

import java.util.ArrayList;
import java.util.List;

public class DaoPersonaImple implements dao<String, Persona>{
    private List<Persona> personas= new ArrayList<>();

     public DaoPersonaImple() {
        personas.add(new Persona("Carlos", "Perez"));
        personas.add(new Persona("Aparicio", "Sol"));
        personas.add(new Persona("Justo", "Sil"));
    }

    @Override
    public List<Persona> getElementos() {
        return this.personas;
    }
}
