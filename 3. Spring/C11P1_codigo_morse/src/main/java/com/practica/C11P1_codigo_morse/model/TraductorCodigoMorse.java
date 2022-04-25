package com.practica.C11P1_codigo_morse.model;

import java.util.HashMap;

public class TraductorCodigoMorse {
    private final HashMap<String, String> MORSE_A_CASTELLANO;

    public TraductorCodigoMorse() {
        this.MORSE_A_CASTELLANO = new HashMap<>();
        MORSE_A_CASTELLANO.put(" ", "");
        MORSE_A_CASTELLANO.put(".-", "A");
        MORSE_A_CASTELLANO.put("-...", "B");
        MORSE_A_CASTELLANO.put("-.-.", "C");
        MORSE_A_CASTELLANO.put("-..", "D");
        MORSE_A_CASTELLANO.put(".", "E");
        MORSE_A_CASTELLANO.put("..-.", "F");
        MORSE_A_CASTELLANO.put("--.", "G");
        MORSE_A_CASTELLANO.put("....", "H");
        MORSE_A_CASTELLANO.put("..", "I");
        MORSE_A_CASTELLANO.put(".---", "J");
        MORSE_A_CASTELLANO.put("-.-", "K");
        MORSE_A_CASTELLANO.put(".-..", "L");
        MORSE_A_CASTELLANO.put("--", "M");
        MORSE_A_CASTELLANO.put("-.", "N");
        MORSE_A_CASTELLANO.put(".--.", "P");
        MORSE_A_CASTELLANO.put(".-.", "R");
        MORSE_A_CASTELLANO.put("...", "S");
    }


    public String morse_a_castellano(String codigo_morse) {
        StringBuilder palabra = new StringBuilder("");
        String[] palabras_en_morse = codigo_morse.split("   ");
        for (String palabra_en_morse : palabras_en_morse) {
            String[] letras_en_morse = palabra_en_morse.split(" ");
            for (String letra_en_morse : letras_en_morse) {
                if (MORSE_A_CASTELLANO.containsKey(letra_en_morse)) {
                    palabra.append(MORSE_A_CASTELLANO.get(letra_en_morse));
                }
            }
            palabra.append(" ");
        }

        return palabra.substring(0, palabra.length()-1);
    }
}
