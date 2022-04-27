package com.santanderbootacamp.Ejercicios.dao;

public interface Dao <K,E>{
    public void agregar(K elemento, E contenidoElemento);

    public E getDatos(K elemento);
}
