package com.practica.C13Blog.services;

import com.practica.C13Blog.dtos.EntradaBlogDTO;

import java.time.LocalDate;

public class BlogService {
    public EntradaBlogDTO publicar(EntradaBlogDTO entradaBlogDTO) {
        return new EntradaBlogDTO(1,"Mock", "mopck", LocalDate.of(1999,12,3));
    }
}
