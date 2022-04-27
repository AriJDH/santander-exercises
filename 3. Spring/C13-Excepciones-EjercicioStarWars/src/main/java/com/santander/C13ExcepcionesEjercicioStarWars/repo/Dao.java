package com.santander.C13ExcepcionesEjercicioStarWars.repo;

import com.santander.C13ExcepcionesEjercicioStarWars.modelos.Personaje;

import java.util.List;

public interface Dao <K,E> {
    public List<E> getElementos(K clave);
}
