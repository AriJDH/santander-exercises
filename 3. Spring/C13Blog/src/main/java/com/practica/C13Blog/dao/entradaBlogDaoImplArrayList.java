package com.practica.C13Blog.dao;

import com.practica.C13Blog.model.EntradaBlog;

import java.util.ArrayList;
import java.util.List;

public class entradaBlogDaoImplArrayList implements Dao<String, EntradaBlog> {
    List<EntradaBlog> entradas = new ArrayList<>();

    @Override
    public void agregar(EntradaBlog elemento) {
        //TODO: si ya existe id lanzar excepcion
        entradas.add(elemento);
    }
}
