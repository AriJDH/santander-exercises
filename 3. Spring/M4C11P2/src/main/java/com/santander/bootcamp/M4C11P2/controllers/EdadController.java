package com.santander.bootcamp.M4C11P2.controllers;

import com.santander.bootcamp.M4C11P2.services.EdadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EdadController {

    @GetMapping("/{day}/{month}/{year}")
    public int getEdad(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        EdadService service = new EdadService();
        return service.calcularEdad(LocalDate.of(year, month, day));
    }
}
