package com.ejercicio.ejercicio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static com.ejercicio.ejercicio.utils.Morse.morseAAscii;

@RestController()
public class TraduccionMorse {
    @GetMapping(path = "/traduccionmorse/{puntos}")

    public static String decodificarMorse(@PathVariable("puntos") String puntos) {
        StringBuilder decodificado = new StringBuilder();
        // Necesitamos separarlo por espacios
        String[] morse = puntos.split(" ");
        for (String morseActual : morse) {
            String equivalencia = morseAAscii(morseActual);
            decodificado.append(equivalencia);
        }
        return decodificado.toString();
    }
}

