package com.santander.ejerciciosWrappers;

import java.util.ArrayList;
import java.util.List;

public class PersonaImpDAO implements DAO<Persona, String>{

    ArrayList<Persona> personas = new ArrayList<>();

    @Override
    public Persona buscarElemento(String key) {
        return null;
    }

    @Override
    public List<Persona> listar() {
        return null;
    }

    @Override
    public void agregar(Persona elment) {
        personas.add(elment);
    }


}
