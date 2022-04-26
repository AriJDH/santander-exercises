package com.multiplesParametros.multiplesParametros.servicios;

import com.multiplesParametros.multiplesParametros.dao.Dao;
import com.multiplesParametros.multiplesParametros.dao.DaoPersonaImpleArraylist;
import com.multiplesParametros.multiplesParametros.modelo.Persona;

import java.util.List;
import java.util.stream.Stream;

public class PersonaServicio{
    private Dao personaDao= new DaoPersonaImpleArraylist();

    public List<Persona> getPersonas(){
        return personaDao.getElementos();
    }
    public Stream<Persona> getPersonasFiltradas(String filtro){
        return personaDao.getElementosFiltrados(filtro);
    }
    public void addPersona(Persona p1){
        personaDao.addElemento(p1);
    }

}
