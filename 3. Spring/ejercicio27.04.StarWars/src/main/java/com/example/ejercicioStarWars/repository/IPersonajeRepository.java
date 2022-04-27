package com.example.ejercicioStarWars.repository;

import java.util.List;

public interface IPersonajeRepository <K, E>{

    public List<E> getElementos(K clave);
}
