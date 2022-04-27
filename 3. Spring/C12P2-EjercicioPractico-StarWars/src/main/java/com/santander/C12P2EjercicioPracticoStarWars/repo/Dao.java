package com.santander.C12P2EjercicioPracticoStarWars.repo;


import java.util.List;

public interface Dao <K,E> {
    public List<E> getElementos(K clave);
}
