package com.santander.practica_spring_jason;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping(path = "/hello/{name}")
    public String saludar(@PathVariable String name) {
        Controller controller = new Controller();
        return controller.saludar() + " " + name;
    }
}
