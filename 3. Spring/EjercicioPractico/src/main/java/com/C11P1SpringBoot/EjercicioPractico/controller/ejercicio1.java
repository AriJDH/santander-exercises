package com.C11P1SpringBoot.EjercicioPractico.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ejercicio1 {
    @GetMapping("/{numero}")
    public String numeros_romanos(@PathVariable Integer numero){
        StringBuilder num_romano = new StringBuilder();
        int[] num_comparar = {1000,900,500,400,100,90,50,40,10, 9, 5, 4, 1};
        String[] num_romanos = {"M","CM","D","CD","C","XC","L","XL", "X", "IX", "V", "IV", "I"};

        for(int i = 0; i < num_comparar.length; i++){
            for(;numero >= num_comparar[i]; numero -= num_comparar[i]){
                num_romano.append(num_romanos[i]);
            }
        }
        return num_romano.toString();
    }

}
