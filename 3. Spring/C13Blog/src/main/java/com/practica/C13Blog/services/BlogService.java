package com.practica.C13Blog.services;

import com.practica.C13Blog.dao.entradaBlogDaoImplArrayList;
import com.practica.C13Blog.dtos.EntradaBlogDTO;
import com.practica.C13Blog.model.EntradaBlog;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BlogService {

    entradaBlogDaoImplArrayList entradaBlogDao = new entradaBlogDaoImplArrayList();

    public EntradaBlogDTO publicar(EntradaBlogDTO entradaBlogDTO) {
        EntradaBlog entradaBlog = new EntradaBlog(entradaBlogDTO.getId(), entradaBlogDTO.getTitulo(), entradaBlogDTO.getNombre_autor(), entradaBlogDTO.getFecha_publicacion());
        entradaBlogDao.agregar(entradaBlog);
        return entradaBlogDTO;
    }
}
