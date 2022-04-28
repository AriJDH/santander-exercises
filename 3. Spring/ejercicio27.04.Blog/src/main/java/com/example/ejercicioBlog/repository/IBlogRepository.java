package com.example.ejercicioBlog.repository;

import java.util.List;

public interface IBlogRepository <K, E>{

    public List<E> findElementos(K clave);

    public void addElemento(E elemento);
}
