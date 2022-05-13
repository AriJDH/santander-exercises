package com.ejercicio;

import java.util.List;

public interface Dao<E, K> {

    public E buscarElemento(K key);

    public List<E> lsitar();

    public void agregar(E elemento);

}