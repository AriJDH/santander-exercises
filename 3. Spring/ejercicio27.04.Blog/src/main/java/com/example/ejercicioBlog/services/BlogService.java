package com.example.ejercicioBlog.services;


import com.example.ejercicioBlog.dto.BlogDto;
import com.example.ejercicioBlog.exceptions.BlogException;
import com.example.ejercicioBlog.models.EntradaBlog;
import com.example.ejercicioBlog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.AttributeNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class BlogService implements IBlogService{

    @Autowired
    IBlogRepository blogRepository;

    @Override
    public List<BlogDto> findId(Integer id) {
        List<EntradaBlog> entradaBlogs =blogRepository.findElementos(id);
        EntradaBlog entradaBlog = entradaBlogs.stream()
                .filter(b -> b.getId().equals(id)).findFirst().orElse(null);
               // .map(b -> new BlogDto(b.getId())).collect(Collectors.toList());

        if(entradaBlog == null){
            throw new BlogException("No encontramos el blog");
        }
        BlogDto blogDto = new BlogDto();
        blogDto.setId(entradaBlog.getId());
        blogDto.setNombreAutor(entradaBlog.getNombreAutor());
        blogDto.setTitulo(entradaBlog.getTitulo());
        blogDto.setFechaPublicacion(entradaBlog.getFechaPublicacion());

        return this.findId(id);
    }
}
