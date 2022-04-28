package com.example.ejercicioBlog.repository;


import com.example.ejercicioBlog.exceptions.BlogExceptionExist;
import com.example.ejercicioBlog.models.EntradaBlog;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Repository(value = "BlogRepository")
public class BlogRepository implements IBlogRepository<Integer, EntradaBlog>{

    private List<EntradaBlog> entradaBlogs = new ArrayList<>();
    @Override
    public List<EntradaBlog> findElementos(Integer clave) {

        Comparator<EntradaBlog> byId = Comparator.comparing(EntradaBlog::getId);
        return this.entradaBlogs;
    }

    @Override
    public void addElemento(EntradaBlog elemento) {

       if(entradaBlogs.stream().anyMatch(b -> b.getId().equals(elemento.getId()))){
           throw new BlogExceptionExist("El blog ya existe");
        }
        entradaBlogs.add(elemento);
    }


}
