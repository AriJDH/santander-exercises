package com.blogExcepciones.blogExcepciones.repository;

import com.blogExcepciones.blogExcepciones.model.EntradaBlog;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DAOBlog implements DAO<String, EntradaBlog> {
    private List<EntradaBlog> blogs=new ArrayList<>();

    @Override
    public boolean addElemento(EntradaBlog ele) {
        if (blogs.contains(ele)){
            return false;
        }else{
            blogs.add(ele);
            return true;
        }
    }

    @Override
    public List<EntradaBlog> getElementos() {
        return blogs;
    }
}
