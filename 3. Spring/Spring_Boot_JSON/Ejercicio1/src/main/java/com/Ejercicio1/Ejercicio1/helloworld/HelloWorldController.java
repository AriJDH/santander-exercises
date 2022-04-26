package com.Ejercicio1.Ejercicio1.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping (path = "/hello")
    public String helloWorld(){
        return "Hello World";
    }
}
