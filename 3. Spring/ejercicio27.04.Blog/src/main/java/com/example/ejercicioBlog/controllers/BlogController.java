package com.example.ejercicioBlog.controllers;

import com.example.ejercicioBlog.dto.BlogDto;
import com.example.ejercicioBlog.services.IBlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class BlogController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    IBlogService blogService;

    @GetMapping("/entradaBlog/{id}")
    public ResponseEntity<BlogDto> findId(@PathVariable Integer id){
        return new ResponseEntity<>(blogService.findId(id), HttpStatus.OK);
    }

    @PostMapping("/nuevoBlog")
    public ResponseEntity<String> addElemento(@RequestBody BlogDto blogDto){
        LOGGER.info(blogDto.toString());
        blogService.addElemento(blogDto);
        return new ResponseEntity<>("Se agrego un nuevo blog", HttpStatus.OK);
    }


}
