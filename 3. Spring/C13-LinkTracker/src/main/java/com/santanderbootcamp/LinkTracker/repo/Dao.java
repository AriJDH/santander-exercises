package com.santanderbootcamp.LinkTracker.repo;

public interface Dao<K,V> {
    public int agregarElemento(V elemento);

    public void eliminarElemento(K elemento);

    public V obtenerElemento(K elemento);
}
