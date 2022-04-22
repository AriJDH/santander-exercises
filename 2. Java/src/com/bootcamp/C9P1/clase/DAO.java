package com.bootcamp.C9P1.clase;

import java.util.List;

//E: elemento, K: clave
public interface DAO <E,K> {
    E buscarElemento(K key);

    void agregar(E elemento);

    List<E> listar();
}
