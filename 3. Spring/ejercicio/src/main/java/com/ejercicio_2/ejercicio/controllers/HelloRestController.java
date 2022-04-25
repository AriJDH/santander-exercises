package com.ejercicio_2.ejercicio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping(path = "/{name}")
    public String sayHelloWithPathVariable(@PathVariable String name){
        return "Hello " + name;
    }

    @GetMapping(path = "/hello/with")
    public String sayHelloWithParam(@RequestParam(value = "name", defaultValue = "World") String name){
        return "Hello " + name;
    }

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello World!";
    }
}
