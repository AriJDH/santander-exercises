package com.santander.practica_json.dao;

import com.santander.practica_json.modelo.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImpl implements DAO<String, Persona> {

    private List<Persona> personas = new ArrayList<>();

    public PersonaDaoImpl() {
    }

    public void AgregarPersona(String nombre, String apellido) {
        personas.add(new Persona(nombre, apellido));
    }

    @Override
    public List<Persona> getElementos() {
        return personas;
    }
}
