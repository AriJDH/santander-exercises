package com.C13.practicaIntegradora.services;

import com.C13.practicaIntegradora.dtos.EntradaBlogDto;
import com.C13.practicaIntegradora.exceptions.EntradaBlogException;
import com.C13.practicaIntegradora.models.EntradaBlog;
import com.C13.practicaIntegradora.repositories.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class EntradaBlogService implements IEntradaBlogService{

    @Autowired
    Dao entradaBlogDao;

    @Override
    public List<EntradaBlogDto> getPostById(Integer numero) {
        List<EntradaBlog> blogs = entradaBlogDao.getElementos(numero);
        List<EntradaBlogDto> entradaBlogDtos = blogs.stream().map(
                p -> new EntradaBlogDto(p.getId(),p.getTitulo(),p.getNombre(),p.getFechaPublicacion())
        ).collect(Collectors.toList());
        if (entradaBlogDtos.size()<1){
            throw new EntradaBlogException("No se encontro el post");
        }else{
            return entradaBlogDtos;
        }

    }

    @Override
    public List<EntradaBlogDto> getPosts() {
        List<EntradaBlog> blogs = entradaBlogDao.getElementos();
        List<EntradaBlogDto> entradaBlogDtos = blogs.stream().map(
                p->new EntradaBlogDto(p.getId(),p.getTitulo(),p.getNombre(),p.getFechaPublicacion())
        ).collect(Collectors.toList());

        return entradaBlogDtos;
    }
}
