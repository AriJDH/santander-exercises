package com.spring.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;

@RestController()
public class caluladoraEdad {



    @GetMapping(path = "/obteneredad")

    public static String edad(@RequestParam int dia, @RequestParam int mes, @RequestParam int anio){
        Period edad = Period.between(LocalDate.of(anio,mes,dia), LocalDate.now());
        return String.format("Usted tiene: %d años, %d meses y %d días",
                edad.getYears(),
                edad.getMonths(),
                edad.getDays());






    }
}
