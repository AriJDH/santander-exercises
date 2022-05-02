package com.example.C13EjercicioPracticoBlog.controller;

import com.example.C13EjercicioPracticoBlog.dto.BlogDTO;
import com.example.C13EjercicioPracticoBlog.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
public class BlogController {
    @Autowired
    @Qualifier("BlogService")
    IService blogService;

    @PostMapping("/blog")
    public ResponseEntity<Integer> createBlog(@RequestBody BlogDTO blogDTO) {
        return new ResponseEntity<>(blogService.create_blog(blogDTO), HttpStatus.OK);
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<BlogDTO> getBlogs(@PathVariable Integer id){
        return new ResponseEntity<>(blogService.obtener_blog(id),HttpStatus.OK);
    }

    @GetMapping("/blogs")
    public ResponseEntity<HashMap<Integer,BlogDTO>> devolverBlogs(){
        return new ResponseEntity<>(blogService.devolver_blogs(), HttpStatus.OK);
    }
}
