package com.ejercicio_2.ejercicio.controllers;

import com.ejercicio_2.ejercicio.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //greeting?name=
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
        return greeting.getContent();
    }
}
