package com.practica.C11P1_codigo_morse.controllers;

import com.practica.C11P1_codigo_morse.model.TraductorCodigoMorse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraductorCodigoMorseController {
    //greeting?name=
    @GetMapping("/traducir")
    public String traducir(@RequestParam(value = "codigo_morse", defaultValue = ".-") String codigo_morse){
        TraductorCodigoMorse traductor = new TraductorCodigoMorse();
        return traductor.morse_a_castellano(codigo_morse);
    }
}
