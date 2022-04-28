package com.C13.practicaIntegradora.repositories;

import java.util.List;

public interface Dao <K,E>{
    public List<E> getElementos(K clave);
    public List<E> getElementos();
}
