package com.bootcamp.calculadoraMetrosCuadrados.dao;

import com.bootcamp.calculadoraMetrosCuadrados.models.PropiedadInmobiliaria;

import java.util.List;

public interface DAO <K, E>{

    public void addElement(E element);

    public List<E> getElements();

    PropiedadInmobiliaria getElement(String nombrePropiedad);
}
