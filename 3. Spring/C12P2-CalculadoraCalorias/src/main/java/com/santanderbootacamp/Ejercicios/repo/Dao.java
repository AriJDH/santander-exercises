package com.santanderbootacamp.Ejercicios.repo;

public interface Dao<K,V> {
    public V getElemento(K elemento);
}
