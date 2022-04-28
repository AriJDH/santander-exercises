package com.santanderbootcamp.Blog.service;

import com.santanderbootcamp.Blog.dto.EntradaBlogDto;
import com.santanderbootcamp.Blog.exception.EntradaException;
import com.santanderbootcamp.Blog.exception.NuevaEntradaException;
import com.santanderbootcamp.Blog.model.EntradaBlog;
import com.santanderbootcamp.Blog.repo.EntradasBlogListDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogService implements IBlogService{
    @Autowired
    EntradasBlogListDaoImpl entradasDao;

    @Override
    public void nuevaEntrada(EntradaBlogDto entrada) {
        if (entradasDao.getEntradas().stream().anyMatch(e->e.getId() == entrada.getId())) {
            throw new NuevaEntradaException("La entrada con el id " + entrada.getId() + " ya se encuentra");
        }
        entradasDao.agregarElemento(new EntradaBlog(entrada.getId(),entrada.getTitulo(),entrada.getAutor(),entrada.getFechaPublicacion()));
    }

    @Override
    public EntradaBlogDto informacionEntrada(int id) {
        EntradaBlog entrada = entradasDao.getEntradas().stream().filter(e->e.getId() == id).findFirst().orElse(null);
        if (entrada == null){
            throw new EntradaException("La entrada con el id " + id + " no se encuentra");
        }
        return new EntradaBlogDto(entrada.getId(),entrada.getTitulo(),entrada.getAutor(),entrada.getFechaPublicacion());
    }

    @Override
    public List<EntradaBlogDto> getEntradas() {
        List<EntradaBlog> entradas = entradasDao.getEntradas();
        List<EntradaBlogDto> entradasDto = entradas.stream().map(e->
                new EntradaBlogDto(e.getId(),e.getTitulo(),e.getAutor(),e.getFechaPublicacion())).collect(Collectors.toList()
        );
        return entradasDto;
    }
}
