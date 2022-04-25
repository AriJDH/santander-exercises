package com.ejercicio.ejercicio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.basic.BasicListUI;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class Ejercicios {


    @GetMapping(path = "/r/{number}")
    public String toRoman(@PathVariable Integer number){

        String[] romanNumbers = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] numbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        String toRoman = "";

        for(int i=0;i<numbers.length;i++) {
            while(number >= numbers[i]) {
                number -= numbers[i];
                toRoman += romanNumbers[i];
            }
        }

        return toRoman;
    }

    @GetMapping(path = "/{codigo}")
    public String morse(@PathVariable String codigo){

        String[] abc = {"A", "B", "C", "D" , "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        ArrayList<String> morse1 = new ArrayList<>();
        morse1.addAll(Arrays.asList(morse));

        String texto = "";
        String letra_actual = "";
        int index;
        char char_actual = '.';

        for (int i = 0; i < codigo.length(); i++) {

            char_actual = codigo.charAt(i);

            if (char_actual == 'e' && codigo.charAt(i+1) != 'e'){
                index = morse1.indexOf(letra_actual);

                if(index != -1){
                    texto +=  abc[index];
                }
                letra_actual = "";
                continue;

            } else if(char_actual == 'e' && codigo.charAt(i+1) == 'e' ){
                index = morse1.indexOf(letra_actual);
                if(index != -1){
                    texto +=  abc[index];
                }
                texto += " ";
                letra_actual = "";
                continue;
            }
            letra_actual += char_actual;
        }

        index = morse1.indexOf(letra_actual);
        texto +=  abc[index];

        return texto;
    }

}

