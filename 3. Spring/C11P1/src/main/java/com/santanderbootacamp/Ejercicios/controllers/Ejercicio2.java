package com.santanderbootacamp.Ejercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Ejercicio2 {
    @GetMapping ("/convertir")
    public String convertirALetras(@RequestParam(value = "codigo", defaultValue = "") String codigoMorse) {
        String salida = "";
        for(String palabra: codigoMorse.split("   ")) {
            for(String letra: palabra.split(" ")) {
                salida += obtenerEquivalencias().get(letra);
            }
        }
        return salida;
    }

    public static HashMap<String, String> obtenerEquivalencias() {
        HashMap<String, String> equivalencias = new HashMap<>();
        equivalencias.put(".-","A");
        equivalencias.put("-...","B");
        equivalencias.put("-.-.","C");
        equivalencias.put("-..","D");
        equivalencias.put(".","E");
        equivalencias.put("..-.","F");
        equivalencias.put("--.","G");
        equivalencias.put("....","H");
        equivalencias.put("..","I");
        equivalencias.put(".---","J");
        equivalencias.put("-.-","K");
        equivalencias.put(".-..","L");
        equivalencias.put("--","M");
        equivalencias.put("-.","N");
        equivalencias.put("--.--","Ñ");
        equivalencias.put("---","O");
        equivalencias.put(".--.","P");
        equivalencias.put("--.-","Q");
        equivalencias.put(".-.","R");
        equivalencias.put("...","S");
        equivalencias.put("-","T");
        equivalencias.put("..-","U");
        equivalencias.put("...-","V");
        equivalencias.put(".--","W");
        equivalencias.put("-..-","X");
        equivalencias.put("-.--","Y");
        equivalencias.put("--..","Z");
        equivalencias.put("-----","0");
        equivalencias.put(".----","1");
        equivalencias.put("..---","2");
        equivalencias.put("...--","3");
        equivalencias.put("....-","4");
        equivalencias.put(".....","5");
        equivalencias.put("-....","6");
        equivalencias.put("--...","7");
        equivalencias.put("---..","8");
        equivalencias.put("----.","9");
        return equivalencias;
    }
}
