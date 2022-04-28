package com.blogExcepciones.blogExcepciones.repository;

import com.blogExcepciones.blogExcepciones.model.EntradaBlog;

import java.util.List;

public interface DAO<K,E> {

    public boolean addElemento(E ele);

    public List<E> getElementos();
}
