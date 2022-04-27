package com.practica.C12P2Practica.dao;

import java.util.List;

public interface Dao<K, E> {
    public List<E> getElementos();

    E getElementoPorId(K clave);
}
