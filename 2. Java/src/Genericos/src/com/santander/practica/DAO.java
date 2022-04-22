package com.santander.practica;

import java.util.List;

public interface DAO<E,K> {

    E buscarElemento(K key);

    List<E> listar();

}
