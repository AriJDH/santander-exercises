package com.practica.C13Blog.controllers;

import com.practica.C13Blog.dtos.EntradaBlogDTO;
import com.practica.C13Blog.services.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {

    private BlogService blogService = new BlogService();

    @GetMapping("/")
    public String home(){
        return "Estas en home";
    }


    @PostMapping("/blogs")
    public ResponseEntity<EntradaBlogDTO> postBlogs(@RequestBody EntradaBlogDTO entradaBlogDTO){
        //TODO: creo un DTO solo para devolver un mensaje?
        EntradaBlogDTO respuesta = blogService.publicar(entradaBlogDTO);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<EntradaBlogDTO> getBlog(@PathVariable Integer id){
        EntradaBlogDTO respuesta = blogService.getEntradaBlog(id);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }


    @GetMapping("/blogs")
    public ResponseEntity<List<EntradaBlogDTO>> getBlogs(){
        List<EntradaBlogDTO> respuesta = blogService.getEntradasBlog();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }


}
