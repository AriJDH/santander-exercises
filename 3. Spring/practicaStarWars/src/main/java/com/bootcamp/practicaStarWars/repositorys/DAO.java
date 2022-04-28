package com.bootcamp.practicaStarWars.repositorys;

import com.bootcamp.practicaStarWars.models.Personaje;

import java.util.List;

public interface DAO <K, E>{

    public List<E> getElements();

    List<Personaje> getElementsPorPalabra(K k);
}
