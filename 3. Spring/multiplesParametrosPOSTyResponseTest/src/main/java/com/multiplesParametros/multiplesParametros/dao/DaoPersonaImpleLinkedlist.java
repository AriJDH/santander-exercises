package com.multiplesParametros.multiplesParametros.dao;

import com.multiplesParametros.multiplesParametros.modelo.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DaoPersonaImpleLinkedlist implements Dao<Persona, String> {
    private List<Persona> personas= new ArrayList<>();

    public DaoPersonaImpleLinkedlist(){
        personas.add(new Persona("juanlinked","asdddddddd"));
        personas.add(new Persona("12linked","a222sdddddddddd"));
        personas.add(new Persona("susilinked","mabelaaaaaaa"));
    }
    @Override
    public List<Persona> getElementos() {
        return this.personas;
    }

    public Stream<Persona> getElementosFiltrados(String elemento) {
        return personas.stream().filter(p->p.getNombre().equalsIgnoreCase(elemento));
    }

    @Override
    public void addElemento(Persona elemento) {
        personas.add(elemento);
    }
}
