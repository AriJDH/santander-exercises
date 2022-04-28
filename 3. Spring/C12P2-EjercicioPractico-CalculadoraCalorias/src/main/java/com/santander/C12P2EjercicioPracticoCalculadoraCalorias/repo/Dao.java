package com.santander.C12P2EjercicioPracticoCalculadoraCalorias.repo;

import java.util.List;

public interface Dao <K,E>{
    public E getElementos(K clave);
}
