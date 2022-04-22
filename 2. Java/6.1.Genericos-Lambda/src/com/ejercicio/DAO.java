package com.ejercicio;

import java.util.List;

public interface DAO<E,K> {

    public E buscarElemento(K key);

    public List<E> listar();

    public void agregar(E elemento);

}
