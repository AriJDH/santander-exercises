package com.c11p2.demo.dao;

import java.util.List;

public interface Dao <K, V>{

    public List<V> getElementos();

   // implementar buscar persona por algua clave

    public void agregar(V elemento);
}
