package com.practica.practica.repo;

import java.util.List;

public interface Dao <K,E>{

    public List<E> getElementos();

    // implementar buscar personar por alguna clave

    public void agregar(E elemento);

}
