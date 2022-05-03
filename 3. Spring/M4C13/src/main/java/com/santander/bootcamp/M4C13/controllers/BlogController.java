package com.santander.bootcamp.M4C13.controllers;

import com.santander.bootcamp.M4C13.DTO.EntradaBlogDTO;
import com.santander.bootcamp.M4C13.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @PostMapping("/crearEntradaBlog")
    public ResponseEntity<String> crearEntradaBlog(@RequestBody EntradaBlogDTO entradaRecibida) {
        EntradaBlogDTO entradaBlogCreada = blogService.crearEntradaBlog(entradaRecibida);
        return new ResponseEntity<>(String.format("Se ha publicado en %s", entradaBlogCreada.getUrl()), HttpStatus.CREATED);
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<EntradaBlogDTO> leerEntradaBlog(@PathVariable int id) {
        return new ResponseEntity<>(blogService.leerEntradaBlog(id), HttpStatus.OK);
    }

    @GetMapping("/blogs")
    public ResponseEntity<List<EntradaBlogDTO>> listarEntradasBlog() {
        return new ResponseEntity<>(blogService.listarEntradasBlog(), HttpStatus.OK);
    }

}
