package com.santander.bootcamp.M4C12P2.repositories;

public interface DAO<T> {

    public void agregar(T elemento);

    public T obtener(String nombre);

}
