package com.ejerciciointegrador.Ejercicio_Integrador.repository;

import com.ejerciciointegrador.Ejercicio_Integrador.dto.EntradaBlogDTO;
import com.ejerciciointegrador.Ejercicio_Integrador.excepciones.BlogNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

@Repository("BlogRepository")
public class BlogDao implements IBlogDao<Integer, EntradaBlogDTO> {

    List <EntradaBlogDTO>blogList;

    public BlogDao() {
        this.blogList = new LinkedList<>();
    }

    @Override
    public Integer crearBlog(EntradaBlogDTO entradaBlogDTO) {
        if (!blogList.contains(entradaBlogDTO)){
            blogList.add(entradaBlogDTO);
        }
        else
            return 0;

        return entradaBlogDTO.getId();
    }

    @Override
    public EntradaBlogDTO buscarBlogPorId(Integer id) {
        try {
            return blogList.stream().filter(blog -> blog.getId()==id).findFirst().get();
        } catch (NoSuchElementException e) {
            throw new BlogNotFoundException("No existe un blog con ese id");
        }
    }

    @Override
    public List<EntradaBlogDTO> mostrarBlogs() {
        return blogList;
    }

}
