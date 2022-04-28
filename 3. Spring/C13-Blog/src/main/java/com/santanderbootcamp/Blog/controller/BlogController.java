package com.santanderbootcamp.Blog.controller;

import com.santanderbootcamp.Blog.dto.EntradaBlogDto;
import com.santanderbootcamp.Blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {

    @Autowired
    IBlogService blogService;

    @PostMapping("/blog")
    public ResponseEntity<String> crearEntrada(@RequestBody EntradaBlogDto entrada) {
        blogService.nuevaEntrada(entrada);
        return new ResponseEntity<>("Se ha creado la entrada", HttpStatus.OK);
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<EntradaBlogDto> informacionEntrada(@PathVariable int id) {
        return new ResponseEntity<>(blogService.informacionEntrada(id), HttpStatus.OK);
    }

    @GetMapping("/blogs")
    public ResponseEntity<List<EntradaBlogDto>> getEntradas() {
        return new ResponseEntity<>(blogService.getEntradas(), HttpStatus.OK);
    }
}
