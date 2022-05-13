package com.santanderbootcamp.desafio_spring.repo;

import java.util.List;

public interface Dao <K, E>{

    //Metodo implementado por ambos DAOs
    public List<E> getElementos();

    public void vaciarElementos();

    public void reservar(K dato1 ,K dato2);

    public E buscar(K dato1, K dato2);

}
