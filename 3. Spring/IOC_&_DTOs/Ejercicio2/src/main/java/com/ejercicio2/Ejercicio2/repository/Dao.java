package com.ejercicio2.Ejercicio2.repository;

import com.ejercicio2.Ejercicio2.models.Personaje;

import java.util.List;

public interface Dao {

    public List<Personaje> buscarPersonaje(String nombre);
}
