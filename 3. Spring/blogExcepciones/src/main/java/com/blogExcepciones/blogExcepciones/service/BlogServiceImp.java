package com.blogExcepciones.blogExcepciones.service;

import com.blogExcepciones.blogExcepciones.dto.BlogDTO;
import com.blogExcepciones.blogExcepciones.dto.ResponseDTO;
import com.blogExcepciones.blogExcepciones.excepcion.ExceptionEncontrada;
import com.blogExcepciones.blogExcepciones.excepcion.ExceptionNoEncontrado;
import com.blogExcepciones.blogExcepciones.model.EntradaBlog;
import com.blogExcepciones.blogExcepciones.repository.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImp implements BlogService{
    @Autowired
    private DAO dao;

    @Override
    public ResponseDTO post(BlogDTO blog) {
       boolean rta= dao.addElemento(new EntradaBlog(blog.getId(),blog.getTitulo(),blog.getNombre(),LocalDate.of(blog.getAño(),blog.getMes(),blog.getDia())));
       if (rta){
           return new ResponseDTO("Exito", blog.getId());
       }
       else{
            throw new ExceptionEncontrada("ya se encuentra");
       }
    }

    @Override
    public BlogDTO get(String id) {
        List<EntradaBlog> blogs=  dao.getElementos();
        EntradaBlog blog = blogs.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);
        if (blog!=null){
            return new BlogDTO(blog.getId(), blog.getTitulo(), blog.getNombre(), blog.getFpublicacion().getDayOfMonth(), blog.getFpublicacion().getMonthValue(), blog.getFpublicacion().getYear());
        }
        else{
            throw new ExceptionNoEncontrado("no se encontro");
        }
    }

    @Override
    public List<BlogDTO> getAll() {
        List<BlogDTO> blogsDTO= new ArrayList<>();
        List<EntradaBlog> blogs=  dao.getElementos();
        blogs.forEach(blog-> blogsDTO.add(new BlogDTO(blog.getId(), blog.getTitulo(), blog.getNombre(), blog.getFpublicacion().getDayOfMonth(), blog.getFpublicacion().getMonthValue(), blog.getFpublicacion().getYear())));
        return blogsDTO;
    }
}
