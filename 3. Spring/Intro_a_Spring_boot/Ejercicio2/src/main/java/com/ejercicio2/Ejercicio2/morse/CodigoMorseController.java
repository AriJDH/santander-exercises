package com.ejercicio2.Ejercicio2.morse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
public class CodigoMorseController {

    private HashMap<String,Character> tabla= new HashMap<>();

    @GetMapping
    public String traducir(){

        prepararTabla();
        String oracion=".... --- .-.. .-   -- ..- -. -.. ---";//Hola mundo
        String palabrasTraducir[]=oracion.split("   ");
        String oracionMorse="";
        for (int i = 0; i < palabrasTraducir.length; i++) {
            String letrasTraducir[]=palabrasTraducir[i].split(" ");
            for (int j = 0; j < letrasTraducir.length; j++) {
                oracionMorse = oracionMorse + tabla.get(letrasTraducir[j]);

            }
            oracionMorse=oracionMorse+" ";
        }

        return oracionMorse;

    }

    private void prepararTabla() {
        tabla.put(".-",'A');
        tabla.put("-...",'B');
        tabla.put("-.-",'C');
        tabla.put("-..",'D');
        tabla.put(".",'E');
        tabla.put("..-.",'F');
        tabla.put("--.",'G');
        tabla.put("....",'H');
        tabla.put("..",'I');
        tabla.put(".---",'J');
        tabla.put("-.",'K');
        tabla.put(".-..",'L');
        tabla.put("--",'M');
        tabla.put("-.",'N');
        tabla.put("---",'O');
        tabla.put(".--.",'P');
        tabla.put("--.-",'Q');
        tabla.put(".-.",'R');
        tabla.put("...",'S');
        tabla.put("-",'T');
        tabla.put("..-",'U');
        tabla.put("...-",'V');
        tabla.put(".--",'W');
        tabla.put("-..-",'X');
        tabla.put("-.--",'Y');
        tabla.put("--..",'Z');
        tabla.put(".----",'1');
        tabla.put("..---",'2');
        tabla.put("...--",'3');
        tabla.put("....-",'4');
        tabla.put(".....",'5');
        tabla.put("-....",'6');
        tabla.put("--...",'7');
        tabla.put("---..",'8');
        tabla.put("----.",'9');
        tabla.put("-----",'0');
    }

}
