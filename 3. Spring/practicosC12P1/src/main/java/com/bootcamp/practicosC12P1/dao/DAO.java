package com.bootcamp.practicosC12P1.dao;

import com.bootcamp.practicosC12P1.models.Alumno;

import java.util.List;

public interface DAO <K, E>{

    public E getElement (String K);

    public void addElement(E element);

    public List<E> getElements();
}
