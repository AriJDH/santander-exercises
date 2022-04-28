package com.example.ejercicioBlog.services;


import com.example.ejercicioBlog.dto.BlogDto;
import com.example.ejercicioBlog.exceptions.BlogExceptionExist;
import com.example.ejercicioBlog.exceptions.BlogExceptionFind;
import com.example.ejercicioBlog.models.EntradaBlog;
import com.example.ejercicioBlog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class BlogService implements IBlogService{

    @Autowired
    IBlogRepository blogRepository;

    @Override
    public BlogDto findId(Integer id) {
        List<EntradaBlog> entradaBlogs =blogRepository.findElementos(id);

        EntradaBlog entradaBlog = entradaBlogs.stream()
                .filter(b -> b.getId().equals(id)).findFirst().orElse(null);

        if(entradaBlog == null){
            throw new BlogExceptionFind("No encontramos el blog");
        }
        BlogDto blogDto = new BlogDto();
        blogDto.setId(entradaBlog.getId());
        blogDto.setNombreAutor(entradaBlog.getNombreAutor());
        blogDto.setTitulo(entradaBlog.getTitulo());
        blogDto.setFechaPublicacion(entradaBlog.getFechaPublicacion());

        return blogDto;
    }

    @Override
    public void addElemento(BlogDto blogDto) {
        EntradaBlog entradaBlog = new EntradaBlog();

            entradaBlog.setId(blogDto.getId());
            entradaBlog.setTitulo(blogDto.getTitulo());
            entradaBlog.setNombreAutor(blogDto.getNombreAutor());
            entradaBlog.setFechaPublicacion(blogDto.getFechaPublicacion());


        blogRepository.addElemento(entradaBlog);


    }
}
