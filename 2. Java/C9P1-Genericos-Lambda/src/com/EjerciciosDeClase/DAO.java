package com.EjerciciosDeClase;

import java.util.List;

public interface DAO <E,K>{
    E  buscarElemento(K key);

    List<E> listar();

    //default void agregar(E){}
    public void agregar(E eemento);
}
