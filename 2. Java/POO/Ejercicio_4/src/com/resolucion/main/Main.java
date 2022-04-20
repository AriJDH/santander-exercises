package com.resolucion.main;

import com.resolucion.clases.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona1= new Persona();
        Persona persona2= new Persona("Pedro",20,"22123456");
        Persona persona3= new Persona("Martin",22,"76235886");
        /*
        Esto no se puede hacer ya que no tenemos un constructor que reciba solo la altura
        o la edad.

        Si hacemos esto entonces nos va a indicar que nos falta parametros para pasar.

        Persona persona1= new Persona(1.80);
        Persona persona1= new Persona(19);
         */
    }
}
