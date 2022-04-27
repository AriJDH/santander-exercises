package com.practica.C12P2Starwars.repo;

public interface Dao <K,E>{
    E getElementoPorId(K clave);
}
