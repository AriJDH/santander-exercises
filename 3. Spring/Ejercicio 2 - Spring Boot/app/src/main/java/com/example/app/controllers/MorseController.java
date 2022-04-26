package com.example.app.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

@RestController
public class MorseController {
    @GetMapping
    @ResponseBody
    public String MorseConverser( @RequestParam String morse){

        String morseDecodificada = "";
        TreeMap<String, String> map = new TreeMap<String, String>();

        map.put(".-", "A");
        map.put("-...", "B");
        map.put("-.-.", "C");
        map.put("----", "CH");
        map.put("-..", "D");
        map.put(".", "E");
        map.put("..-.", "F");
        map.put("--.", "G");
        map.put( "....", "H");
        map.put("..", "I");
        map.put(".---", "J");
        map.put("-.-", "K");
        map.put(".-..", "L");
        map.put("--", "M");
        map.put("-.", "N");
        map.put("--.--", "Ñ");
        map.put("---", "O");
        map.put(".--.", "P");
        map.put(".-.", "Q");
        map.put(".-.", "R");
        map.put("...", "S");
        map.put("-", "T");
        map.put("..-", "U");
        map.put("...-", "V");
        map.put(".--", "W");
        map.put("-..-", "X");
        map.put("-.--", "Y");
        map.put("--..", "Z");

        String[] palabra = morse.split(" ");

        for (int i = 0; i < palabra.length ; i++) {
            System.out.println(palabra[i]);
           if(map.containsKey(palabra[i])){
              morseDecodificada += map.get(palabra[i]);
           }
        }
        return morseDecodificada;

    }
    }

