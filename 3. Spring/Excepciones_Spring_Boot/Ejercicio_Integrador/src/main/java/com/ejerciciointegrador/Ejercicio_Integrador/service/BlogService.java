package com.ejerciciointegrador.Ejercicio_Integrador.service;

import com.ejerciciointegrador.Ejercicio_Integrador.dto.EntradaBlogDTO;
import com.ejerciciointegrador.Ejercicio_Integrador.excepciones.BlogNotFoundException;
import com.ejerciciointegrador.Ejercicio_Integrador.repository.IBlogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service(value = "BlogService")
public class BlogService {

    @Autowired
    @Qualifier("BlogRepository")
    IBlogDao blogDao;


    @ResponseStatus(value = HttpStatus.CREATED)
    public Integer crearBlog(EntradaBlogDTO entradaBlogDTO){
        Integer id= blogDao.crearBlog(entradaBlogDTO);
        if(id==0){
            throw new BlogNotFoundException("Ya existe un blog con el id ingresado");
        }
        else
            return id;
    }

    @ResponseStatus(value = HttpStatus.FOUND)
    public EntradaBlogDTO buscarBlogPorId(Integer id) {
        return blogDao.buscarBlogPorId(id);
    }

    @ResponseStatus(value = HttpStatus.FOUND)
    public List<EntradaBlogDTO> mostrarBlogs() {
        return blogDao.mostrarBlogs();
    }
}
