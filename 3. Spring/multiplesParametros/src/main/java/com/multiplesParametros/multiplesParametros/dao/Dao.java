package com.multiplesParametros.multiplesParametros.dao;

import com.multiplesParametros.multiplesParametros.modelo.Persona;

import java.util.List;
import java.util.stream.Stream;

public interface Dao <E,K>{


    public List<E> getElementos();

    public Stream<E> getElementosFiltrados(K elemento);
}
