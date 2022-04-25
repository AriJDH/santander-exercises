package com.ejercicio.ejercicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.stream.Collectors;

@RestController
public class Saludo implements buscador<List<String>> {
    @GetMapping
    public String saludar() {
        return "Hola mundo, como va?";
    }
    /*
    @GetMapping(path = "/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name;
    }
     */

    @GetMapping(path = "/{num}")
    public String conversionRomana(@PathVariable int num) {
        String numRomano = "";
        while (num >= 1000) {
            num -= 1000;
            numRomano += "M";
        }
        if (num >= 900) {
            num -= 900;
            numRomano += "CM";
        }
        if (num >= 500) {
            num -= 500;
            numRomano += "D";
        }
        if (num >= 400) {
            num -= 400;
            numRomano += "CD";
        }
        while (num >= 100) {
            num -= 100;
            numRomano += "C";
        }
        if (num >= 90) {
            num -= 90;
            numRomano += "XC";
        }
        if (num >= 50) {
            num -= 50;
            numRomano += "L";
        }
        if (num >= 40) {
            num -= 40;
            numRomano += "XL";
        }
        while (num >= 10) {
            num -= 10;
            numRomano += "X";
        }
        if (num >= 9) {
            num -= 9;
            numRomano += "IX";
        }
        if (num >= 5) {
            num -= 5;
            numRomano += "V";
        }
        if (num >= 4) {
            num -= 4;
            numRomano += "IV";
        }
        while (num >= 1) {
            num -= 1;
            numRomano += "I";
        }
        return numRomano;
    }

    @GetMapping(path = "/morse/{string}")
    public String conversionRomana(@PathVariable String string) {
        HashMap letras = new HashMap();
        letras.put(".-", "A");
        letras.put("-...", "B");
        letras.put("-.-.", "C");
        letras.put("----", "CH");
        letras.put("-..", "D");
        letras.put(".", "E");
        letras.put("..-.", "F");
        letras.put("--.", "G");
        letras.put("....", "H");
        letras.put("..", "I");
        letras.put(".---", "J");
        letras.put("-.-", "K");
        letras.put(".-..", "L");
        letras.put("--", "M");
        letras.put("-.", "N");
        letras.put("--.--", "Ñ");
        letras.put("---", "O");
        letras.put(".--.", "P");
        letras.put("--.-", "Q");
        letras.put(".-.", "R");
        letras.put("...", "S");
        letras.put("-", "T");
        letras.put("..-", "U");
        letras.put("...-", "V");
        letras.put(".--", "W");
        letras.put("-..-","X");
        letras.put("-.--","Y");
        letras.put("--..", "Z");
        String textoTraducido = "";
        String[] palabras = string.split("   ");
        for(String palabra : palabras) {
            String[] letras2 = palabra.split(" ");
            for(String caract : letras2) {
                textoTraducido += letras.get(caract);
            }
            textoTraducido += " ";
        }
        return textoTraducido;
    }

    @Override
    @GetMapping(path = "/buscarEnArreglo/{palabra}")
    public List<String> buscarString(@PathVariable String palabra) {
        List<String> memoria = new ArrayList<>(4);
        memoria.add("HOLA");
        memoria.add("HOLA");
        memoria.add("HOLA");
        memoria.add("CHAU");
        memoria.add("NOS");
        memoria.add("VEMOS");
        List<String> res = memoria.stream().filter(p -> p.equals(palabra)).collect(Collectors.toList());
        return res;
    }

    @GetMapping(path = "/buscarEnArregloBool/{palabra}")
    public boolean buscarStringBool(@PathVariable String palabra) {
        List<String> memoria = new ArrayList<>(4);
        memoria.add("HOLA");
        memoria.add("HOLA");
        memoria.add("HOLA");
        memoria.add("CHAU");
        memoria.add("NOS");
        memoria.add("VEMOS");
        return memoria.stream().anyMatch(p -> p.equals(palabra));
    }
}
