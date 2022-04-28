package com.ejerciciointegrador.Ejercicio_Integrador.repository;

import com.ejerciciointegrador.Ejercicio_Integrador.dto.EntradaBlogDTO;

import java.util.List;

public interface IBlogDao<K,E> {

    public Integer crearBlog(E e);

    EntradaBlogDTO buscarBlogPorId(K id);

    List<E> mostrarBlogs();
}
