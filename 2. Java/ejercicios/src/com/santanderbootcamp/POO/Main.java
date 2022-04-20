package com.santanderbootcamp.POO;

import com.santanderbootcamp.POO.modelos.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona personaPepito = new Persona("12950012", "Pepito", 70);
        Persona personaJulian = new Persona("32334234", "Julian", 34, 72.0, 1.82);

        System.out.println("La persona " + personaJulian + ": ");
        System.out.print("--> Tiene un indice de masa corporal que se encuentra en: ");
        switch (personaJulian.calcularIMC()) {
            case -1:
                System.out.println("Bajo Peso");
                break;
            case 0:
                System.out.println("Peso Saludable");
                break;
            case 1:
                System.out.println("Sobrepeso");
        }
        if (personaJulian.esMayorDeEdad()) {
            System.out.println("--> Es mayor de edad");
        }
        else {
            System.out.println("--> Es menor de edad");
        }
    }
}
