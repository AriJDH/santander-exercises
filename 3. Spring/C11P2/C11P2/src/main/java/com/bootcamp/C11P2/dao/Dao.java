package com.bootcamp.C11P2.dao;

import java.util.List;

public interface Dao<K, E> {

    public List<E> getElements();

    // implementar buscar persona por alguna clave
}
