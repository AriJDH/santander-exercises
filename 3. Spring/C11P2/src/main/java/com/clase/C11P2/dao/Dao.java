package com.clase.C11P2.dao;

import java.util.List;

public interface Dao <K,E>{
    public List<E> getElementos();

    // implementar buscar persona por alguna clave (??primary key)
    public E getElementoPorId(K clave);


}
