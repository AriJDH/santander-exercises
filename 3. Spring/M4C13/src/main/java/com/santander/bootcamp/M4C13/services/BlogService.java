package com.santander.bootcamp.M4C13.services;

import com.santander.bootcamp.M4C13.DTO.EntradaBlogDTO;
import com.santander.bootcamp.M4C13.repositories.BlogDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    BlogDAO blogDAO;

    public EntradaBlogDTO crearEntradaBlog(EntradaBlogDTO entradaRecibida) {
        return blogDAO.crear(entradaRecibida);
    }

    public EntradaBlogDTO leerEntradaBlog(int id) {
        return blogDAO.buscar(id);
    }

    public List<EntradaBlogDTO> listarEntradasBlog() {
        return blogDAO.listar();
    }

}
