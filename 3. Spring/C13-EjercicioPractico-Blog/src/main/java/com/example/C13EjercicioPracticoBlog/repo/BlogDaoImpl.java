package com.example.C13EjercicioPracticoBlog.repo;

import com.example.C13EjercicioPracticoBlog.modelos.Blog;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.HashMap;

@Repository(value="BlogDaoImpl")
public class BlogDaoImpl implements DAO<Integer,Blog> {

    private HashMap<Integer,Blog> blogs;

    public BlogDaoImpl() {
        this.blogs = new HashMap<>();
        blogs.put(1, new Blog(1,"Influencers","Yuya", LocalDate.of(1999,01,01)));
        blogs.put(2, new Blog(2,"Comidas","Leo", LocalDate.of(1999,01,01)));
        blogs.put(3, new Blog(3,"Ropa Moda","Geraldine", LocalDate.of(1999,01,01)));
        blogs.put(4, new Blog(4,"Ropa Moda","Anggie", LocalDate.of(1999,01,01)));
        blogs.put(5, new Blog(5,"Ropa Moda","Carmen", LocalDate.of(1999,01,01)));
        blogs.put(6, new Blog(6,"Ropa Moda","Marcos", LocalDate.of(1999,01,01)));
    }

    public HashMap<Integer,Blog> obtener_blogs(){
        return this.blogs;
    }

    @Override
    public Integer crear_blog(Blog blog) {
        //si el id ya existe retorno 0
        if (blogs.containsKey(blog.getId())){
            return 0;
        }
        else {
            blogs.put(blog.getId(), blog);
            return blog.getId();
        }
    }

}
