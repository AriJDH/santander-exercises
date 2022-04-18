package com.bootcamp.EjercicioCondicionales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el número de personas participantes: ");
        int personas= teclado.nextInt();

        int i = 1;
        int abc = 0;
        int ab = 0;
        int ac = 0;
        int bc = 0;
        int a = 0;

        do {
            System.out.println("Persona número: "+i);

            System.out.println("¿Está suscripto al Diario A?: 1. Si, 2. No (ingrese el número)");
            int diarioA = teclado.nextInt();

            System.out.println("¿Está suscripto al Diario B?: 1. Si, 2. No (ingrese el número)");
            int diarioB = teclado.nextInt();

            System.out.println("¿Está suscripto al Diario C?: 1. Si, 2. No (ingrese el número)");
            int diarioC = teclado.nextInt();

            if (diarioA == 1 && diarioB == 1 && diarioC == 1){
                abc++;
                ab++;
                ac++;
                bc++;
                a++;
            }else if (diarioA == 1 && diarioB == 1 && diarioC == 2){
                ab++;
                a++;
            }else if (diarioA == 1 && diarioB == 2 && diarioC == 1){
                ac++;
                a++;
            }else if (diarioA == 2 && diarioB == 1 && diarioC == 1){
                bc++;
            }else if (diarioA == 1 && diarioB == 2 && diarioC == 2){
                a++;
            }

            i++;

        }while (i<=personas);

        System.out.println("Suscriptos a los 3 diarios: "+abc + "\nSuscriptos a los diarios A y B: "+ab+"\nSuscriptos a los diarios A y C: "+ac+"\nSuscriptos a los diarios B y C: "+bc+"\nSuscriptos solo al diario A: "+a);

    }

}
