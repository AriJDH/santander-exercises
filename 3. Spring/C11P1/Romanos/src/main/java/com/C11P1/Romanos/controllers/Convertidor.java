package com.C11P1.Romanos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Convertidor {


    @GetMapping(path = "/{num}")
    public String Romano(@PathVariable int num) {

        int i = 0;
        int[] inNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romNum = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String rom = "";
        while (true) {
            if (num == 0) {
                break;
            } else if (num < 0) {
                return "No se permite números negativos";
            }else if (num > 3999) {
                return "No se puede escribir ese número en romanos";
            }
                while (num > 0) {
                    if (num >= inNum[i]) {
                        rom = rom + romNum[i];
                        num = num - inNum[i];
                    }  else {
                        i++;
                    }
                    System.out.println();
                }
            }
            return rom;
        }


}

