package com.C11P1.Morse.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Morse {

    @GetMapping(path = "/{morse}")
    public String Traductor(@PathVariable String morse) {

        HashMap<String, String> traductor = new HashMap<String, String>();

        traductor.put(".-", "A");
        traductor.put("-...", "B");
        traductor.put("-.-.", "C");
        traductor.put("-..", "D");
        traductor.put(".", "E");
        traductor.put("..-.", "F");
        traductor.put("--.", "G");
        traductor.put("....", "H");
        traductor.put("..", "I");
        traductor.put(".---", "J");
        traductor.put("-.-", "K");
        traductor.put(".-..", "L");
        traductor.put("--", "M");
        traductor.put("-.", "N");
        traductor.put("--.--", "Ñ");
        traductor.put("---", "O");
        traductor.put(".--.", "P");
        traductor.put("--.-", "Q");
        traductor.put(".-.", "R");
        traductor.put("...", "S");
        traductor.put("-", "T");
        traductor.put("..-", "U");
        traductor.put("...-", "V");
        traductor.put(".--", "W");
        traductor.put("-..-", "X");
        traductor.put("-.--", "Y");
        traductor.put("--..", "Z");
        traductor.put("-----", "0");
        traductor.put(".-----", "1");
        traductor.put("..---", "2");
        traductor.put("...--", "3");
        traductor.put("....-", "4");
        traductor.put(".....", "5");
        traductor.put("-....", "6");
        traductor.put("--...", "7");
        traductor.put("---..", "8");
        traductor.put("----.", "9");
        traductor.put(".-.-.-", ".");
        traductor.put("--..--", ",");
        traductor.put("---...", ":");
        traductor.put("..--..", "?");
        traductor.put(".----.", "'");
        traductor.put("-....-", "-");
        traductor.put("-..-.", "/");
        traductor.put(".-..-.", "\"");
        traductor.put(".--.-.", "@");
        traductor.put("-...-", "=");
        traductor.put("-.-.--", "!");

        String Texto = "";


        String[] Codigo;

        Codigo = morse.split("   ");

        for (String m : Codigo) {
            String[] letras;
            letras = m.split(" ");
            for (String n : letras) {
                if (traductor.containsKey(n)) {
                    Texto = Texto + traductor.get(n);
                }else{
                    return "Error de tipeo al introducir el código morse";
                }
            }
            Texto = Texto + " ";
        }




        return Texto;

        }
    }

