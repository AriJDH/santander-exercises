package com.bootcamp.C7P1;

import com.bootcamp.C7P1.modelos.Persona;

public class Main {
    public static void main(String[] args) {
        Persona personaCompleta = new Persona("Agus",18,"38998262",78,1.84f);
        Persona personaMedio = new Persona("Agus",18,"38998262");
        Persona personaVacia = new Persona();

        //Error
        //Persona persona_vacia = new Persona("agus", "18");

        int valor = personaCompleta.calcularIMC();

        switch (valor){
            case -1:
                System.out.println("Bajo peso" + valor);
                break;
            case 0:
                System.out.println("Peso saludable");
                break;
            case 1:
                System.out.println("Sobrepeso");
                break;
        }

        boolean es_mayor = personaCompleta.esMayorDeEdad();

        if (es_mayor) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.println(personaCompleta);

    }
}
