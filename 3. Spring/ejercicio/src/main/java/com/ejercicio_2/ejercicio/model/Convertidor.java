package com.ejercicio_2.ejercicio.model;

import java.util.HashMap;

public class Convertidor {

    private final HashMap<String, Integer> ROMANOS_A_DECIMAL = new HashMap<>();

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
            if (resto >= ROMANOS_A_DECIMAL.get("M")){
                letra_romana = "M";
            } else if (resto >= ROMANOS_A_DECIMAL.get("D")){
                letra_romana = "D";
            } else if (resto >= ROMANOS_A_DECIMAL.get("C")){
                letra_romana = "C";
            } else if (resto >= ROMANOS_A_DECIMAL.get("L")){
                letra_romana = "L";
            } else if (resto >= ROMANOS_A_DECIMAL.get("X")){
                letra_romana = "X";
            } else if (resto >= ROMANOS_A_DECIMAL.get("V")){
                letra_romana = "V";
            } else if (resto >= ROMANOS_A_DECIMAL.get("I")){
                letra_romana = "I";
            }
            numero_romano.append(letra_romana);
            resto -= ROMANOS_A_DECIMAL.get(letra_romana);
        }

        return numero_romano.toString();
    }
}
