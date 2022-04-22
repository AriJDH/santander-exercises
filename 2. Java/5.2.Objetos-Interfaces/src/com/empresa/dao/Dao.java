package com.empresa.dao;

import com.empresa.modelo.Persona;

import java.util.List;

public interface Dao {

    public void guardar();

    public List<Persona> listar();

}
