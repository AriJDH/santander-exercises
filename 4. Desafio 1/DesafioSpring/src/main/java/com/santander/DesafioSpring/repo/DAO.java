package com.santander.DesafioSpring.repo;

import java.util.List;

public interface DAO<K,E> {

    public E buscarElemento(K clave);
    public List<E> obtenerElementos();

}
