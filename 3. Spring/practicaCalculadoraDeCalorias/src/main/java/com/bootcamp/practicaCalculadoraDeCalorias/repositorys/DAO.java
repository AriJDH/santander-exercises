package com.bootcamp.practicaCalculadoraDeCalorias.repositorys;

import java.util.List;

public interface DAO <K, E>{

    public List<E> getElements();

    public E getElementBy(K k);

    public void addElement(E e);


}
