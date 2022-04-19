package com.ejerciciosDia18;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int contadorDiarioA = 0, contadorDiarioB = 0, contadorDiarioC = 0;
        for (int i = 1; i <= 50; i++) {
            System.out.println("¿Está suscripto al diario A? (S/N)");
            if (scann.nextLine().equals("S")){
                contadorDiarioA++;
            }
            System.out.println("¿Está suscripto al diario B? (S/N)");
            if (scann.nextLine().equals("S")){
                contadorDiarioB++;
            }
            System.out.println("¿Está suscripto al diario C? (S/N)");
            if (scann.nextLine().equals("S")){
                contadorDiarioC++;
            }

        }
        System.out.println("La cantidad de personas que estan suscriptas a los tres diarios son: " + (contadorDiarioA + contadorDiarioB + contadorDiarioC));
        System.out.println("La cantidad de personas que estan suscriptas al diario A y C son: " + (contadorDiarioA + contadorDiarioC));
        System.out.println("La cantidad de personas que estan suscriptas al diario A y B son: " + (contadorDiarioA + contadorDiarioB));
        System.out.println("La cantidad de personas que estan suscriptas al diario B y C son: " + (contadorDiarioB + contadorDiarioC));
        System.out.println("La cantidad de personas que estan suscriptas al diario A son: " + contadorDiarioA);
    }
}
