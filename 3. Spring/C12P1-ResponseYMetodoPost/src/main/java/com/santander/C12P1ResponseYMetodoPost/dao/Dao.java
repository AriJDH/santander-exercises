package com.santander.C12P1ResponseYMetodoPost.dao;

import java.util.List;

public interface Dao <K,E>{
    public List<E> getElementos();

    //implementar buscar persona por alguna clave

    public void agregar(E elemento);

}
