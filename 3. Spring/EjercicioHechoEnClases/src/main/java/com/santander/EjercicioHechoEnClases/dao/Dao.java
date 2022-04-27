package com.santander.EjercicioHechoEnClases.dao;

import com.santander.EjercicioHechoEnClases.modelo.Persona;

import java.util.List;

public interface Dao <K,E>{
    public List<E> getElementos();

    //implementar buscar persona por alguna clave
    public E getElementoPorId(K clave);

}
