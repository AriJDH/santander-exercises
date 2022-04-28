package com.ejerciciointegrador.Ejercicio_Integrador.controller;

import com.ejerciciointegrador.Ejercicio_Integrador.dto.EntradaBlogDTO;
import com.ejerciciointegrador.Ejercicio_Integrador.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    @Qualifier("BlogService")
    private BlogService blogService;


    @PostMapping("/blog")
    public ResponseEntity<Integer> crearBlog(@RequestBody EntradaBlogDTO blogDTO){
        return new ResponseEntity<>(blogService.crearBlog(blogDTO), HttpStatus.OK);
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<EntradaBlogDTO> buscarBlogPorId(@PathVariable Integer id){
        return new ResponseEntity<>(blogService.buscarBlogPorId(id), HttpStatus.OK);
    }

    @GetMapping("/blogs")
    public ResponseEntity<List<EntradaBlogDTO>> mostrarBlogs(){
        return new ResponseEntity<>(blogService.mostrarBlogs(), HttpStatus.OK);
    }


}
