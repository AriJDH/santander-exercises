package com.practica.C13Blog.dao;

import com.practica.C13Blog.model.EntradaBlog;

import java.util.ArrayList;
import java.util.List;

public class EntradaBlogDaoImplArrayList implements Dao<Integer, EntradaBlog> {
    List<EntradaBlog> entradas = new ArrayList<>();

    @Override
    public void agregar(EntradaBlog elemento) {
        //TODO: si ya existe id lanzar excepcion
        entradas.add(elemento);
    }

    @Override
    public EntradaBlog getElemento(Integer id) {
        return entradas.stream().filter(e -> e.getId().equals(id)).findAny().orElseThrow();
    }
}
