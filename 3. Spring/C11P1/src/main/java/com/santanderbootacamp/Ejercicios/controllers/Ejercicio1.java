package com.santanderbootacamp.Ejercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio1 {

    @GetMapping ("/aRomanos")
    public static String convertirNumeroRomano(@RequestParam(value = "numero", defaultValue = "0") int number){
        String romanNumbers[] = {"M", "CMXC", "CM", "D", "CDXC", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (number > 0 || arab.length == (i - 1)) {
            while ((number - arab[i]) >= 0) {
                number -= arab[i];
                result.append(romanNumbers[i]);
            }
            i++;
        }
        return result.toString();
    }
    /*
        return result.toString();

        String numeroRomano = "";
        while(numero / 1000 > 0) {
            numeroRomano += "M";
            numero -= 1000;
        }
        if (numero % 1000 >= 900) {
            numeroRomano += "CM";
            numero -= 900;
        }
        while(numero / 500 > 0) {
            numeroRomano += "D";
            numero -= 500;
        }
        while(numero / 100 > 0) {
            numeroRomano += "C";
            numero -= 100;
        }
        if(numero % 100 >= 90) {
            numeroRomano += "XC";
            numero -= 90;
        }
        while(numero / 50 > 0) {
            numeroRomano += "L";
            numero -= 50;
        }
        if(numero % 10 >= 9) {
            numeroRomano += "I";
            numero += 1;
        }
        while(numero / 10 > 0) {
            numeroRomano += "X";
            numero -= 10;
        }
        if(numero % 5 >= 4) {
            numeroRomano += "I";
            numero += 1;
        }
        while(numero / 5 > 0) {
            numeroRomano += "V";
            numero -= 5;
        }
        while(numero > 0) {
            numeroRomano += "I";
            numero -= 1;
        }
        return String.format("%s", numeroRomano);
    }*/
}
