package com.C13.practicaIntegradora.controllers;

import com.C13.practicaIntegradora.dtos.EntradaBlogDto;
import com.C13.practicaIntegradora.services.IEntradaBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntradaBlogController {

    @Autowired
    IEntradaBlogService entradaBlogService;

    @GetMapping("/blog/{id}")
    public ResponseEntity<List<EntradaBlogDto>> getPost(@PathVariable Integer id){
        List<EntradaBlogDto> entradaBlogDtos = entradaBlogService.getPostById(id);
        return new ResponseEntity<>(entradaBlogDtos, HttpStatus.OK);
    }
    @GetMapping("/blogs")
    public ResponseEntity<List<EntradaBlogDto>> getPosts(){
        return new ResponseEntity<>(entradaBlogService.getPosts(), HttpStatus.OK);
    }
}
