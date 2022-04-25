package com.example.demo.controllers;

import com.example.demo.Buscador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Convertidor implements Buscador<List<String>> {

    @GetMapping(path = "/morse/{string}")
    public String conversionRomana(@PathVariable String string) {
        HashMap letras = new HashMap();
        letras.put(".-", "A");
        letras.put("-...", "B");
        letras.put("-.-.", "C");
        letras.put("----", "CH");
        letras.put("-..", "D");
        letras.put(".", "E");
        letras.put("..-.", "F");
        letras.put("--.", "G");
        letras.put("....", "H");
        letras.put("..", "I");
        letras.put(".---", "J");
        letras.put("-.-", "K");
        letras.put(".-..", "L");
        letras.put("--", "M");
        letras.put("-.", "N");
        letras.put("--.--", "Ñ");
        letras.put("---", "O");
        letras.put(".--.", "P");
        letras.put("--.-", "Q");
        letras.put(".-.", "R");
        letras.put("...", "S");
        letras.put("-", "T");
        letras.put("..-", "U");
        letras.put("...-", "V");
        letras.put(".--", "W");
        letras.put("-..-","X");
        letras.put("-.--","Y");
        letras.put("--..", "Z");
        String textoTraducido = "";
        String[] palabras = string.split("   ");
        for(String palabra : palabras) {
            String[] letras2 = palabra.split(" ");
            for(String caract : letras2) {
                textoTraducido += letras.get(caract);
            }
            textoTraducido += " ";
        }
        return textoTraducido;
    }

    @Override
    @GetMapping(path = "/buscarEnArreglo/{palabra}")
    public List<String> buscarString(@PathVariable String palabra) {
        List<String> memoria = new ArrayList<>();
        memoria.add("HOLA");
        memoria.add("HOLA");
        memoria.add("HOLA");
        memoria.add("CHAU");
        memoria.add("NOS");
        memoria.add("VEMOS");
        List<String> res = memoria.stream().filter(p -> p.equals(palabra)).collect(Collectors.toList());
        return res;
    }

}