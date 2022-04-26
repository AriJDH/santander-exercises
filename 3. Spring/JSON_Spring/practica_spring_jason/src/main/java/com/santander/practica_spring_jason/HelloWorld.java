package com.santander.practica_spring_jason;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
public class HelloWorld {
    @GetMapping(path = "/hello/{nombre}/{apellido}/{edad}")
    public String saludar(@PathVariable String nombre, @PathVariable String apellido, @PathVariable int edad) {
        Controller controller = new Controller();
        return controller.saludar() + " Tu nombre es: " + nombre + ", tu apellido es: " + apellido + " y tenés " + edad + " años.";
    }

    @GetMapping(path = "/{dia}/{mes}/{anio}")
    public int calcular(@PathVariable int dia, @PathVariable int mes, @PathVariable int anio){

        String[] fechaActual = LocalDateTime.now().toString().split("T");
        String[] anioMesDia = fechaActual[0].split("-");
        int edad = Integer.parseInt(anioMesDia[0]) - (anio+1);
        if (Integer.parseInt(anioMesDia[1]) >= mes) {
            edad += 1;
        }
        else if (Integer.parseInt(anioMesDia[1]) == mes && Integer.parseInt(anioMesDia[2]) >= dia) {
            edad += 1;
        }
        return edad;
    }
}
