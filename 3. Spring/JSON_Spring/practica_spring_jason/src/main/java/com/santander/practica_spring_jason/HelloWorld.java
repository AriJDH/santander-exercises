package com.santander.practica_spring_jason;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping(path = "/hello")
    public String saludar() {
        Controller controller = new Controller();
        return controller.saludar();
    }
}
