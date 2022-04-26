package com.ejercicioMorce.ejercicioMorce.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

@RestController
public class Morse {
    @GetMapping(path = "/{codigo}")
    public String convertir(@PathVariable String codigo){
        ArrayList<String> aPalabras = new ArrayList<String>();
        ArrayList<String> aLetras = new ArrayList<String>();
        ArrayList<String> aTexto = new ArrayList<String>();
        Map<String,String> tablaConvertion = new HashMap<String,String>();
        tablaConvertion.put(".-","A");
        tablaConvertion.put("-...","B");
        tablaConvertion.put("-.-.","C");
        tablaConvertion.put("----","CH");
        tablaConvertion.put("-..","D");
        tablaConvertion.put(".","E");
        tablaConvertion.put("..-.","F");
        tablaConvertion.put("--.","G");
        tablaConvertion.put("....","H");
        tablaConvertion.put("..","I");
        tablaConvertion.put(".---","J");
        tablaConvertion.put("-.-","K");
        tablaConvertion.put(".-..","L");
        tablaConvertion.put("--","M");
        tablaConvertion.put("-.","N");
        tablaConvertion.put("--.--","Ñ");
        tablaConvertion.put("---","O");
        tablaConvertion.put(".--.","P");
        tablaConvertion.put("--.-","Q");
        tablaConvertion.put(".-.","R");
        tablaConvertion.put("...","S");
        tablaConvertion.put("-","T");
        tablaConvertion.put("..-","U");
        tablaConvertion.put("...-","V");
        tablaConvertion.put(".--","W");
        tablaConvertion.put("-..-","X");
        tablaConvertion.put("-.--","Y");
        tablaConvertion.put("--..","Z");
        tablaConvertion.put(" "," ");



        String[] parts = codigo.split("   ");
        for (int i = 0; i < parts.length; i++) {
            aPalabras.add(parts[i]);
        }
        int cont1=0;
        for (String element: aPalabras) {
            String[] letras = element.split(" ");
            for (int i = 0; i < letras.length; i++) {
                aLetras.add(letras[i]);
            }
            aLetras.add(" ");
            cont1++;
        }

        for (int i = 0; i < aLetras.size(); i++) {
            aTexto.add(tablaConvertion.get(aLetras.get(i)));
        }
        String mensaje="";
        for (String algo : aTexto){
            mensaje+=algo;
        }

        return mensaje;
    }


}
