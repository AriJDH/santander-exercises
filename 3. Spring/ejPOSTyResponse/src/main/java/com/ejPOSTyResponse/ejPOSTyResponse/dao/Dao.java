package com.ejPOSTyResponse.ejPOSTyResponse.dao;

import com.ejPOSTyResponse.ejPOSTyResponse.modelo.Alumno;

import java.util.Optional;

public interface Dao<E,T> {
    public void addElemento(E elemento);

    public E getElemento(T string);
}
