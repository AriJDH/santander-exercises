package com.example.ejercicioBlog.controllers;

import com.example.ejercicioBlog.dto.BlogDto;
import com.example.ejercicioBlog.services.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {

    @Autowired
    IBlogService blogService;

    @GetMapping("/entradaBlog/{id}")
    public ResponseEntity<List<BlogDto>> findElementos(@PathVariable Integer id){
        List<BlogDto> blogDtos = blogService.findId(id);
        return new ResponseEntity<>(blogDtos, HttpStatus.OK);
    }


}
