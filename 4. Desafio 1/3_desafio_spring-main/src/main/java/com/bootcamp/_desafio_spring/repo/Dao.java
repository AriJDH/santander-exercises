package com.bootcamp._desafio_spring.repo;

import java.util.List;

public interface Dao <K,E>{
    List<E> getElementos();
    E getElementoPorId(K k);
    void agregar(E elemento);
    void putElemento(E elemento);



}
