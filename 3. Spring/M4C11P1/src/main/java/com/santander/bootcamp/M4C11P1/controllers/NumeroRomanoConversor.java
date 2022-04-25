package com.santander.bootcamp.M4C11P1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class NumeroRomanoConversor {

    @GetMapping(path = "/convertirRomanoADecimal/{numeroRomano}")
    public int convertirRomanoADecimal(@PathVariable String numeroRomano) {
        int numeroDecimal = 0;

        for (int indice = 0; indice < numeroRomano.length(); indice++) {
            switch (numeroRomano.charAt(indice)) {
                case 'M':
                    numeroDecimal += 1_000;
                    break;
                case 'D':
                    numeroDecimal += 500;
                    break;
                case 'C':
                    if (indice + 1 < numeroRomano.length() && (numeroRomano.charAt(indice + 1) == 'M' || numeroRomano.charAt(indice + 1) == 'D')) {
                        numeroDecimal -= 200;
                    }
                    numeroDecimal += 100;
                    break;
                case 'L':
                    numeroDecimal += 50;
                    break;
                case 'X':
                    if (indice + 1 < numeroRomano.length() && (numeroRomano.charAt(indice + 1) == 'C' || numeroRomano.charAt(indice + 1) == 'L')) {
                    numeroDecimal -= 20;
                }
                numeroDecimal += 10;
                break;
                case 'V':
                    numeroDecimal += 5;
                    break;
                case 'I':
                    if (indice + 1 < numeroRomano.length() && (numeroRomano.charAt(indice + 1) == 'X' || numeroRomano.charAt(indice + 1) == 'V')) {
                        numeroDecimal -= 2;
                    }
                    numeroDecimal += 1;
                    break;
                default:

            }
        }

        return numeroDecimal;
    }

    @GetMapping(path = "/convertirDecimalARomano/{numeroDecimal}")
    public String convertirDecimalARomano(@PathVariable int numeroDecimal) {
        StringBuilder numeroRomano = new StringBuilder();

        while (numeroDecimal > 0) {
            if (numeroDecimal >= 1_000) {
                numeroRomano.append("M");
                numeroDecimal -= 1_000;
            } else if (numeroDecimal >= 900) {
                numeroRomano.append("CM");
                numeroDecimal -= 900;
            } else if (numeroDecimal >= 500) {
                numeroRomano.append("D");
                numeroDecimal -= 500;
            } else if (numeroDecimal >= 400) {
                numeroRomano.append("CD");
                numeroDecimal -= 400;
            } else if (numeroDecimal >= 100) {
                numeroRomano.append("C");
                numeroDecimal -= 100;
            } else if (numeroDecimal >= 90) {
                numeroRomano.append("XC");
                numeroDecimal -= 90;
            } else if (numeroDecimal >= 50) {
                numeroRomano.append("L");
                numeroDecimal -= 50;
            } else if (numeroDecimal >= 40) {
                numeroRomano.append("XL");
                numeroDecimal -= 40;
            } else if (numeroDecimal >= 10) {
                numeroRomano.append("X");
                numeroDecimal -= 10;
            } else if (numeroDecimal >= 9) {
                numeroRomano.append("IX");
                numeroDecimal -= 9;
            } else if (numeroDecimal >= 5) {
                numeroRomano.append("V");
                numeroDecimal -= 5;
            } else if (numeroDecimal >= 4) {
                numeroRomano.append("IV");
                numeroDecimal -= 4;
            } else if (numeroDecimal >= 1) {
                numeroRomano.append("I");
                numeroDecimal -= 1;
            }
        }

        return numeroRomano.toString();
    }
}
