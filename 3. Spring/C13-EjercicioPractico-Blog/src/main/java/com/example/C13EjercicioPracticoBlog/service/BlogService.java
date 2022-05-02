package com.example.C13EjercicioPracticoBlog.service;

import com.example.C13EjercicioPracticoBlog.dto.BlogDTO;
import com.example.C13EjercicioPracticoBlog.exception.BlogException;
import com.example.C13EjercicioPracticoBlog.modelos.Blog;
import com.example.C13EjercicioPracticoBlog.repo.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;

@Service(value = "BlogService")
public class BlogService implements IService{
    @Autowired
    @Qualifier("BlogDaoImpl")
    DAO blogDao;

    @ResponseStatus(value = HttpStatus.CREATED)
    public Integer create_blog(BlogDTO blogDTO) {
        Integer id = blogDao.crear_blog(blogDTO);
        if (id == 0){
            throw new BlogException("¡El blog ya existe!");
        }
        else{
            return id;
        }
    }

    @ResponseStatus(value = HttpStatus.FOUND)
    public BlogDTO obtener_blog(Integer id) {
        HashMap<Integer,Blog> blogs = blogDao.obtener_blogs();
        try {
            BlogDTO blogDTO = new BlogDTO(blogs.get(id));
            return blogDTO;
        }
        catch (Exception e){
            throw new BlogException("No existe el blog con ese id.");
        }
    }

    @ResponseStatus(value = HttpStatus.FOUND)
    public HashMap<Integer, BlogDTO> devolver_blogs() {
        return blogDao.obtener_blogs();
    }
}
