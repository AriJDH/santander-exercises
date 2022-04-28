package com.practica.C13Blog.dao;

import com.practica.C13Blog.model.EntradaBlog;

public interface Dao <K,E> {

    void agregar(E elemento);

    E getElemento(K id);
}
