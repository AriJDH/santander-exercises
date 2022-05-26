package com.santander.bootcamp;

import java.util.List;

public interface Dao<E,K> {

    E buscarElemento(K key);

    List<E> listar();

    public void agregar(E elemento);

}
