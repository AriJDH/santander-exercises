package com.ejercicio_2.ejercicio.model;

import java.util.HashMap;

public class Convertidor {

    private final HashMap<String, Integer> ROMANOS_A_DECIMAL = new HashMap<>();
    private final int I_PRIMER_NUMERO = 0;
    private final int I_SEGUNDO_NUMERO = 1;
    private final int LETRAS_CONSECUTIVAS = 2;

    public Convertidor() {
        ROMANOS_A_DECIMAL.put("I", 1);
        ROMANOS_A_DECIMAL.put("V", 5);
        ROMANOS_A_DECIMAL.put("X", 10);
        ROMANOS_A_DECIMAL.put("L", 50);
        ROMANOS_A_DECIMAL.put("C", 100);
        ROMANOS_A_DECIMAL.put("D", 500);
        ROMANOS_A_DECIMAL.put("M", 1000);
    }

    public int romano_a_entero(String numero_romano){
        int sum = 0;
        for (int i = 0; i < numero_romano.length(); i++) {
            String letra = numero_romano.substring(i,i+1);
            if ( ROMANOS_A_DECIMAL.containsKey(letra)){
                sum += ROMANOS_A_DECIMAL.get(letra);
            }
        }
        return sum;
    }

    public String entero_a_romano (int numero){
        StringBuilder numero_romano = new StringBuilder();
        int resto = numero;
        String letra_romana = "";

        while (resto > 0){
            if (resto >= ROMANOS_A_DECIMAL.get("M")) {
                letra_romana = "M";
            } else if (resto >= ROMANOS_A_DECIMAL.get("M") - ROMANOS_A_DECIMAL.get("C")){
                letra_romana = "CM";
            } else if (resto >= ROMANOS_A_DECIMAL.get("D")){
                letra_romana = "D";
            } else if (resto >= ROMANOS_A_DECIMAL.get("D") - ROMANOS_A_DECIMAL.get("C")){
                letra_romana = "CD";
            } else if (resto >= ROMANOS_A_DECIMAL.get("C")){
                letra_romana = "C";
            } else if (resto >= ROMANOS_A_DECIMAL.get("C") - ROMANOS_A_DECIMAL.get("X")){
                letra_romana = "XC";
            } else if (resto >= ROMANOS_A_DECIMAL.get("L")){
                letra_romana = "L";
            } else if (resto >= ROMANOS_A_DECIMAL.get("L") - ROMANOS_A_DECIMAL.get("X")){
                letra_romana = "XL";
            } else if (resto >= ROMANOS_A_DECIMAL.get("X")){
                letra_romana = "X";
            } else if (resto >= ROMANOS_A_DECIMAL.get("X") - ROMANOS_A_DECIMAL.get("I")){
                letra_romana = "IX";
            } else if (resto >= ROMANOS_A_DECIMAL.get("V")){
                letra_romana = "V";
            } else if (resto >= ROMANOS_A_DECIMAL.get("V") - ROMANOS_A_DECIMAL.get("I")){
                letra_romana = "IV";
            } else if (resto >= ROMANOS_A_DECIMAL.get("I")){
                letra_romana = "I";
            }
            numero_romano.append(letra_romana);

            /*Si meti dos letras*/
            if (letra_romana.length() >= LETRAS_CONSECUTIVAS){
                String letra_1 = letra_romana.substring(I_PRIMER_NUMERO, I_PRIMER_NUMERO+1);
                String letra_2 = letra_romana.substring(I_SEGUNDO_NUMERO, I_SEGUNDO_NUMERO+1);
                resto -= ROMANOS_A_DECIMAL.get(letra_2) - ROMANOS_A_DECIMAL.get(letra_1);
            } else {
                resto -= ROMANOS_A_DECIMAL.get(letra_romana);
            }
        }

        return numero_romano.toString();
    }
}
