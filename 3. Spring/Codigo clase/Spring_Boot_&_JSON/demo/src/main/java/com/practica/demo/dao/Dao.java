package com.practica.demo.dao;

import java.util.List;

public interface Dao <K,E>{

    public List<E> getElementos();

    public E buscarPorIndex(int index);

    public E buscarPorNombre(String nombre);
}
