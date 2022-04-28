package com.practica.C13Blog.services;

import com.practica.C13Blog.dao.EntradaBlogDaoImplArrayList;
import com.practica.C13Blog.dtos.EntradaBlogDTO;
import com.practica.C13Blog.model.EntradaBlog;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

    EntradaBlogDaoImplArrayList entradaBlogDao = new EntradaBlogDaoImplArrayList();

    public EntradaBlogDTO publicar(EntradaBlogDTO entradaBlogDTO) {
        EntradaBlog entradaBlog = new EntradaBlog(entradaBlogDTO.getId(), entradaBlogDTO.getTitulo(), entradaBlogDTO.getNombre_autor(), entradaBlogDTO.getFecha_publicacion());
        entradaBlogDao.agregar(entradaBlog);
        return entradaBlogDTO;
    }

    public EntradaBlogDTO getEntradaBlog(Integer id_blog) {
        EntradaBlog entradaBlog = entradaBlogDao.getElemento(id_blog);

        //mapeo
        return new EntradaBlogDTO(entradaBlog.getId(),
                entradaBlog.getTitulo(),
                entradaBlog.getNombre_autor(),
                entradaBlog.getFecha_publicacion());
    }
}
