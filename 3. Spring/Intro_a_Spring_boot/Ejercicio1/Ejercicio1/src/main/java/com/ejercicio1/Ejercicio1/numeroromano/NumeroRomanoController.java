package com.ejercicio1.Ejercicio1.numeroromano;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class NumeroRomanoController {

    @GetMapping (path = "/{numero}")
    public String helloWorld(@PathVariable int numero){
        String numeroRomano = "";
        if(numero<4000) {

            int miles = numero / 1000;
            int centenas = (numero / 100) % 10;
            int decimas = (numero / 10) % 10;
            int unidades = numero % 10;

            for (int i = 0; i < miles; i++) {
                numeroRomano = numeroRomano + "M";
            }

            switch (centenas) {
                case 9:
                    numeroRomano = numeroRomano + "CM";
                    break;
                case 5:
                    numeroRomano = numeroRomano + "D";
                    break;
                case 4:
                    numeroRomano = numeroRomano + "CD";
                    break;
                default:
                    if (centenas > 5) {
                        numeroRomano = numeroRomano + "D";
                        for (int i = 6; i <= centenas; i++) {
                            numeroRomano = numeroRomano + "C";
                        }

                    } else if (centenas < 4) {

                        for (int i = 1; i <= centenas; i++) {
                            numeroRomano = numeroRomano + "C";
                        }
                    }
                    break;
            }
            switch (decimas) {
                case 9:
                    numeroRomano = numeroRomano + "XC";
                    break;
                case 5:
                    numeroRomano = numeroRomano + "L";
                    break;
                case 4:
                    numeroRomano = numeroRomano + "XL";
                    break;
                default:
                    if (decimas > 5) {
                        numeroRomano = numeroRomano + "L";
                        for (int i = 6; i <= decimas; i++) {
                            numeroRomano = numeroRomano + "X";
                        }

                    } else if (decimas < 4) {

                        for (int i = 1; i <= decimas; i++) {
                            numeroRomano = numeroRomano + "X";
                        }
                    }
                    break;
            }
            switch (unidades) {
                case 9:
                    numeroRomano = numeroRomano + "IX";
                    break;
                case 5:
                    numeroRomano = numeroRomano + "V";
                    break;
                case 4:
                    numeroRomano = numeroRomano + "IV";
                    break;
                default:
                    if (unidades > 5) {
                        numeroRomano = numeroRomano + "V";
                        for (int i = 6; i <= unidades; i++) {
                            numeroRomano = numeroRomano + "I";
                        }

                    } else if (unidades < 4) {

                        for (int i = 1; i <= unidades; i++) {
                            numeroRomano = numeroRomano + "I";
                        }
                    }
                    break;
            }
        }
        else{
            return "ERROR: El numero es mayor a 4000";
        }
        return numeroRomano;
    }

}
