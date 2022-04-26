package com.ejercicio2.ejercicio2.dao;

import java.util.List;

public interface Dao <K, E> {

    public List<E> getElementos();

    public void agregar(E elemento);

    //implementar buscar persona por alguna clave

}