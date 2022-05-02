package com.santander.C13ExcepcionesYManejoDeErrores.repo;

import java.util.List;

public interface Dao <K,E> {
    public List<E> getElementos();

    public void agregar(E elemento);

}
