package com.Ejercicio2.Ejercicio2.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping(path = "/hello/{name}")
    public String helloWorld(@PathVariable String name) {
        return "Hello World "+ name;
    }

}
