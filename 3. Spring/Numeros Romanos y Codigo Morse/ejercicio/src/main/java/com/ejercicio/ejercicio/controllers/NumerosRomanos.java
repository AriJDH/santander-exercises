package com.ejercicio.ejercicio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class NumerosRomanos {


    @GetMapping(path = "/numerosromanos/{num}")

    public String numero(@PathVariable("num") String num){
        String numerosRomanos[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String numeros= "123456789";
        int posicion= 0;
        String transformacion= "";
      try{
        for(int f=0; f<num.length(); f++){
            posicion= numeros.indexOf(num.charAt(f));
            transformacion= transformacion +numerosRomanos[posicion];
        }
      }catch (IndexOutOfBoundsException e){
          System.out.println("Numero fuera de alcance");

      }finally {
          System.out.println("terminó la ejecucion");
      }
        return transformacion;



    }

}
