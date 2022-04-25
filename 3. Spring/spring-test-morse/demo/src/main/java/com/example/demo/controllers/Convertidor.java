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
        HashMap mapa = new HashMap();
        mapa.put(".-", "A");
        mapa.put("-...", "B");
        mapa.put("-.-.", "C");
        mapa.put("----", "CH");
        mapa.put("-..", "D");
        mapa.put(".", "E");
        mapa.put("..-.", "F");
        mapa.put("--.", "G");
        mapa.put("....", "H");
        mapa.put("..", "I");
        mapa.put(".---", "J");
        mapa.put("-.-", "K");
        mapa.put(".-..", "L");
        mapa.put("--", "M");
        mapa.put("-.", "N");
        mapa.put("--.--", "Ñ");
        mapa.put("---", "O");
        mapa.put(".--.", "P");
        mapa.put("--.-", "Q");
        mapa.put(".-.", "R");
        mapa.put("...", "S");
        mapa.put("-", "T");
        mapa.put("..-", "U");
        mapa.put("...-", "V");
        mapa.put(".--", "W");
        mapa.put("-..-","X");
        mapa.put("-.--","Y");
        mapa.put("--..", "Z");
        String textoTraducido = "";
        String[] palabrasMorse = string.split("   ");
        for(String palabraMorse : palabrasMorse) {
            String[] letrasPalabraMorse = palabraMorse.split(" ");
            for(String letra : letrasPalabraMorse) {
                textoTraducido += mapa.get(letra);
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