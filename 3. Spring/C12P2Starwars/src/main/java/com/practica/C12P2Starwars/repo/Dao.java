package com.practica.C12P2Starwars.repo;

import java.util.List;

public interface Dao <K,E>{
    List<E> getElementos(K palabra);
}
