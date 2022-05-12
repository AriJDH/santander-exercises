package com.desafioSpring.desafio_spring.repo;

import java.util.List;

public interface Dao <K, E>{

    //Metodo implementado por ambos DAOs
    public List<E> getElementos();

}
