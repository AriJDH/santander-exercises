package com.C11P1.morse.collections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Colecciones{

    public static HashMap<String, String> mapaMorse = new HashMap<String, String>();

    static {
        mapaMorse.put(".-", "a");
        mapaMorse.put("-...", "b");
        mapaMorse.put("-.-.", "c");
        mapaMorse.put("-..", "d");
        mapaMorse.put(".", "e");
        mapaMorse.put("..-.", "f");
        mapaMorse.put("--.", "g");
        mapaMorse.put("....", "h");
        mapaMorse.put("..", "i");
        mapaMorse.put(".---", "j");
        mapaMorse.put("-.-", "k");
        mapaMorse.put(".-..", "l");
        mapaMorse.put("--", "m");
        mapaMorse.put("-.", "n");
        mapaMorse.put("---", "o");
        mapaMorse.put(".--.", "p");
        mapaMorse.put("--.-", "q");
        mapaMorse.put(".-.", "r");
        mapaMorse.put("...", "s");
        mapaMorse.put("-", "t");
        mapaMorse.put("..-", "u");
        mapaMorse.put("...-", "v");
        mapaMorse.put(".--", "w");
        mapaMorse.put("-..-", "x");
        mapaMorse.put("-.--", "y");
        mapaMorse.put("--..", "z");
        mapaMorse.put("/", " ");
    }

    @GetMapping (path = "/{oracionMorse}")
    public String aCodigoMorse(String oracionMorse) {
        String textoConvertido = "";
        String[] letrasMorse = oracionMorse.split(" ");
        String[] keys = mapaMorse.keySet().toArray(new String[0]);

        for (int i = 1; i <= mapaMorse.size(); i ++){
            for (String key : keys) {
                if (key == letrasMorse[i]){
                    textoConvertido += mapaMorse.get(key);
                }
                else { textoConvertido += " "; }
            }
            return "El texto es: " + textoConvertido;
        }

        return "";
    }

}
