package com.ejercicio.ejercicio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CodigoMorse {
    @GetMapping(path = "/codigomorse/{palabra}")

    public static String palabra(@PathVariable("palabra") String palabra){
         String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
         String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKMNOPQRSTUVWXYZ";
         int posicion= 0;
         String traduccion= "";

         for(int f=0; f<palabra.length(); f++){
             posicion= abc.indexOf(palabra.charAt(f));
             traduccion= traduccion +morse[posicion];
         }
         return traduccion;



    }

}
