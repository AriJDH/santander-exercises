package com.example.ejercicioBlog.repository;


import com.example.ejercicioBlog.models.EntradaBlog;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Repository
public class BlogRepository implements IBlogRepository<Integer, EntradaBlog>{

    private List<EntradaBlog> entradaBlogs = new ArrayList<>();
    @Override
    public List<EntradaBlog> findElementos(Integer clave) {

        Comparator<EntradaBlog> byId = Comparator.comparing(EntradaBlog::getId);
        return this.entradaBlogs;
                //this.entradaBlogs.stream().filter(b -> b.getId().compareTo(clave)).toString();
    }
}
