package com.santander.ejerciciosWrappers;

import java.util.List;

public interface DAO<E,K> {

    E buscarElemento(K key);

    List<E> listar();

    public void agregar(E elment);

}
