package com.bootcamp.C11P1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class morseController {

    @GetMapping(path = "morse")
    public String traductorMorse(@RequestParam(value = "codigo", defaultValue = "No hay ningun codigo a traducir") String codigo){

        Map<String, String> alfabeto = new HashMap<>();

        alfabeto.put(".-", "A");
        alfabeto.put("-...", "B");alfabeto.put("-.-.", "C");alfabeto.put("-..", "D");alfabeto.put(".", "E");
        alfabeto.put("..-.", "F");alfabeto.put("--.", "G");alfabeto.put("....", "H");alfabeto.put("..", "I");alfabeto.put(".---", "J");alfabeto.put("-.-", "K");
        alfabeto.put(".-..", "L");alfabeto.put("--", "M");alfabeto.put("-.", "N");alfabeto.put("---", "O");
        alfabeto.put(".--.", "P");alfabeto.put("--.-", "Q");alfabeto.put(".-.", "R");
        alfabeto.put("...", "S");alfabeto.put("-", "T");alfabeto.put("..-", "U");alfabeto.put("...-", "V");
        alfabeto.put(".--", "W");alfabeto.put("-..-", "X");alfabeto.put("-.--", "Y");alfabeto.put("--..", "Z");

        alfabeto.put(".----", "1");alfabeto.put("..---", "2");alfabeto.put("...--", "3");
        alfabeto.put("....-", "4");alfabeto.put(".....", "5");alfabeto.put("-....", "6");
        alfabeto.put("--...", "7");alfabeto.put("---..", "8");alfabeto.put("----.", "9");
        alfabeto.put("-----", "0");

        boolean nuevaLetra = false;
        String salida = "";
        int primerLetra = 0;
        int ultimaLetra = 0;

        codigo = codigo + "  ";

        for (int i = 0; i < codigo.length(); i++) {

            if(i == codigo.length()-1){
                break;
            }

            if(codigo.substring(i, i+1).equals(" ")){
                ultimaLetra = i;
                nuevaLetra = true;
            }

            if (nuevaLetra){
                if(alfabeto.get(codigo.substring(primerLetra, ultimaLetra)) == null){
                    salida = salida + " ";
                }else{
                    salida = salida + alfabeto.get(codigo.substring(primerLetra, ultimaLetra));
                }

                primerLetra = ultimaLetra+1;
                nuevaLetra = false;
            }
        }
        return salida;
    }

}
