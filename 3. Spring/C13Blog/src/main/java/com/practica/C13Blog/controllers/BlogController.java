package com.practica.C13Blog.controllers;

import com.practica.C13Blog.dtos.EntradaBlogDTO;
import com.practica.C13Blog.services.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
