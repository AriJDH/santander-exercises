package com.bootcamp.C11P1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class convertidorController {

    private int numeroAConvertir;

    @GetMapping(path = "convertir")
    public String convertirNumero(@RequestParam(value = "numero", defaultValue = "No hay numero para convertir") String numero){
        String salida = "";

        int numeroAConvertir = Integer.parseInt(numero);

        while ((numeroAConvertir/1000) > 0){
            numeroAConvertir = numeroAConvertir - 1000;
            salida = salida + "M";
        }

        while ((numeroAConvertir/500) > 0){
            if (numeroAConvertir >= 900) {
                numeroAConvertir = numeroAConvertir - 900;
                salida = salida + "CM";
            } else {
                numeroAConvertir = numeroAConvertir - 500;
                salida = salida + "D";
            }
        }

        while ((numeroAConvertir/100) > 0){
            if(numeroAConvertir>=400){
                numeroAConvertir = numeroAConvertir - 400;
                salida = salida + "CD";
            }else{
                numeroAConvertir = numeroAConvertir - 100;
                salida = salida + "C";
            }
        }

        while ((numeroAConvertir/50) > 0){
            if (numeroAConvertir >= 90) {
                numeroAConvertir = numeroAConvertir - 90;
                salida = salida + "XC";
            } else {
                numeroAConvertir = numeroAConvertir - 50;
                salida = salida + "L";
            }
        }

        while ((numeroAConvertir/10) > 0){
            if(numeroAConvertir>=40){
                numeroAConvertir = numeroAConvertir - 40;
                salida = salida + "XL";
            }else{
                numeroAConvertir = numeroAConvertir - 10;
                salida = salida + "X";
            }
        }

        while ((numeroAConvertir/5) > 0) {
            if (numeroAConvertir >= 9) {
                numeroAConvertir = numeroAConvertir - 9;
                salida = salida + "IX";
            } else {
                numeroAConvertir = numeroAConvertir - 5;
                salida = salida + "V";
            }
        }

        while ((numeroAConvertir/1) > 0){
            if (numeroAConvertir>=4){
                numeroAConvertir = numeroAConvertir-4;
                salida=salida+"IV";
            }else{
                numeroAConvertir = numeroAConvertir - 1;
                salida = salida + "I";
            }
        }

        return salida;
    }

}
