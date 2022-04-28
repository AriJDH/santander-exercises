package com.blogExcepciones.blogExcepciones.controller;

import com.blogExcepciones.blogExcepciones.dto.BlogDTO;
import com.blogExcepciones.blogExcepciones.dto.ResponseDTO;
import com.blogExcepciones.blogExcepciones.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    private BlogService ser;
    @PostMapping ("/blog")
    public ResponseEntity<ResponseDTO> postBlog(@RequestBody BlogDTO blog){
        return new ResponseEntity<>(ser.post(blog), HttpStatus.OK);
    }
    @GetMapping("/blog/{id}")
    public ResponseEntity<BlogDTO>getBlog(@PathVariable String id){
        return new ResponseEntity<>(ser.get(id),HttpStatus.OK);
    }
    @GetMapping("/blogs")
    public ResponseEntity<List<BlogDTO>> getBlogs(){
        return new ResponseEntity<>(ser.getAll(),HttpStatus.OK);
    }
}
