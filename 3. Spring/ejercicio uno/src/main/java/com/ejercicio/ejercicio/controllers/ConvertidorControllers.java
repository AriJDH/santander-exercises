package com.ejercicio.ejercicio.controllers;

import com.ejercicio.ejercicio.modelo.Convertidor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConvertidorControllers {
    @GetMapping(path = "/conversorRomano")
    public String convertirEnRomanos(@RequestParam(value = "numero", defaultValue = "0") int strNumero){
        return Convertidor.convertirNumeroRomano(strNumero);
    }

    @GetMapping(path = "/conversorMorse")
    public String convertirEnMorse(@RequestParam(value = "codigo", defaultValue = "0") String strNumero){
        return Convertidor.decodificarMorse(strNumero);
    }
}

