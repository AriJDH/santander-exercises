package com.ejercicio_2.ejercicio.controllers;

import com.ejercicio_2.ejercicio.model.Convertidor;
import com.ejercicio_2.ejercicio.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertidorController {

    //greeting?name=
    @GetMapping("/convertir")
    public String greeting(@RequestParam(value = "numero", defaultValue = "10") int numero){
        Convertidor convertidor = new Convertidor();
        return convertidor.entero_a_romano(numero);
    }
}
