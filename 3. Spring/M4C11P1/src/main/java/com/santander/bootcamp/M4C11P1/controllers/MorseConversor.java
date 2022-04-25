package com.santander.bootcamp.M4C11P1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;
import java.util.Map;
import java.util.HashMap;

@RestController
public class MorseConversor {

    @GetMapping(path = "/convertirMorseATexto/{morse}")
    public String convertirMorseATexto(@PathVariable String morse) {
        String textoTraducido = "";

        for(String palabras : morse.split("   ")) {
            for(String letra : palabras.split(" ")) {
                textoTraducido += diccionarioMorseATexto.get(letra);
            }
            textoTraducido += " ";
        }

        return textoTraducido;
    }

    @GetMapping(path = "/convertirTextoAMorse/{texto}")
    public String convertirTextoAMorse(@PathVariable String texto) {
        String textoTraducido = "";

        for(String palabra : texto.toUpperCase().split(" ")) {
            for(int x = 0; x < palabra.length(); x++) {
                textoTraducido += diccionarioTextoAMorse.get(palabra.charAt(x));
                textoTraducido += " ";
            }
            textoTraducido += "   ";
        }

        return textoTraducido;
    }

    private final HashMap<String, Character> diccionarioMorseATexto = new HashMap<>(Map.ofEntries(
        Map.entry(".-", 'A'),
        Map.entry("-...", 'B'),
        Map.entry("-.-.", 'C'),
        Map.entry("-..", 'D'),
        Map.entry(".", 'E'),
        Map.entry("..-.", 'F'),
        Map.entry("--.", 'G'),
        Map.entry("....", 'H'),
        Map.entry("..", 'I'),
        Map.entry(".---", 'J'),
        Map.entry("-.-", 'K'),
        Map.entry(".-..", 'L'),
        Map.entry("--", 'M'),
        Map.entry("-.", 'N'),
        Map.entry("---", 'O'),
        Map.entry(".--.", 'P'),
        Map.entry("--.-", 'Q'),
        Map.entry(".-.", 'R'),
        Map.entry("...", 'S'),
        Map.entry("-", 'T'),
        Map.entry("..-", 'U'),
        Map.entry("...-", 'V'),
        Map.entry(".--", 'W'),
        Map.entry("-..-",'X'),
        Map.entry("-.--",'Y'),
        Map.entry("--..", 'Z'),
        Map.entry(".----", '1'),
        Map.entry("..---", '2'),
        Map.entry("...--", '3'),
        Map.entry("....-", '4'),
        Map.entry(".....", '5'),
        Map.entry("-....", '6'),
        Map.entry("--...", '7'),
        Map.entry("---..", '8'),
        Map.entry("----.", '9'),
        Map.entry("-----", '0')
    ));

    private final HashMap<Character, String> diccionarioTextoAMorse = new HashMap<Character, String>(
        diccionarioMorseATexto.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey))
    );
}
