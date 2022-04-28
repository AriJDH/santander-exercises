package com.practica.C13Blog.services;

import com.practica.C13Blog.dao.EntradaBlogDaoImplArrayList;
import com.practica.C13Blog.dtos.EntradaBlogDTO;
import com.practica.C13Blog.model.EntradaBlog;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<EntradaBlogDTO> getEntradasBlog() {
        List<EntradaBlog> entradas_blog= entradaBlogDao.getElementos();
        //mapeo
        List<EntradaBlogDTO> entradas_dtos = entradas_blog.stream().map(
                e -> new EntradaBlogDTO(e.getId(),
                        e.getTitulo(),
                        e.getNombre_autor(),
                        e.getFecha_publicacion())
        ).collect(Collectors.toList());

        return  entradas_dtos;
    }
}
