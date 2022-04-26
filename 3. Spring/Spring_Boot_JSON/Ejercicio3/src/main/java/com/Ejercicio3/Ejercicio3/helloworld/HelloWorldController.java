package com.Ejercicio3.Ejercicio3.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping(path = "/hello/{name}/{surname}/{age}")
    public String helloWorld(@PathVariable String name,@PathVariable String surname,@PathVariable int age) {
        return "Hello World! Tu nombre es: "+name+", tu apellido es: "+surname+" y tenés "+age+" años";
    }
}
