package com.multiplesParametros.multiplesParametros.dao;

import com.multiplesParametros.multiplesParametros.modelo.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DaoPersonaImpleArraylist implements Dao<Persona,String>{

    private List<Persona> personas= new ArrayList<>();

    public DaoPersonaImpleArraylist(){
        personas.add(new Persona("juan","asd"));
        personas.add(new Persona("12","a222sd"));
        personas.add(new Persona("susi","mabel"));
    }
    @Override
    public List<Persona> getElementos() {
        return this.personas;
    }

    @Override
    public Stream<Persona> getElementosFiltrados(String elemento) {
        return personas.stream().filter(p->p.getApellido().equalsIgnoreCase(elemento));
    }

    @Override
    public void addElemento(Persona elemento) {
        personas.add(elemento);
    }


}
