package com.santander.dh;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner diarioIndividualIngresado = new Scanner (System.in);
        Scanner diarioTotallIngresado = new Scanner (System.in);

        int diarioA = 0;
        int diarioB = 0;
        int diarioC = 0;
        int todosLosDiarios = 0;


        int contadorDiarioA = 0;
        int contadorDiarioB = 0;
        int contadorDiarioC = 0;
        int contadorDiarioTotal = 0;

        int contadorDiarioAyC = 0;
        int contadorDiarioAyB = 0;
        int contadorDiarioByC = 0;

        for (int i = 1; i < 6; i++) {

            System.out.println("Encuesta para la persona número " + i);
            System.out.println("¿Estas suscrito a los 3 diarios A,B y C? Responder con 1 para sí, 0 para no");
            todosLosDiarios = diarioTotallIngresado.nextInt();

            if(todosLosDiarios == 1){
                ++contadorDiarioTotal;
            } else {
                System.out.println("¿Estas suscrito al diario A? Responder con 1 para sí, 0 para no");
                diarioA = diarioIndividualIngresado.nextInt();
                System.out.println("¿Estas suscrito al diario B? Responder con 1 para sí, 0 para no");
                diarioB = diarioIndividualIngresado.nextInt();
                System.out.println("¿Estas suscrito al diario C? Responder con 1 para sí, 0 para no");
                diarioC = diarioIndividualIngresado.nextInt();
            }
            if(diarioA == 1){
                ++contadorDiarioA;
                if(diarioB == 1){
                    ++contadorDiarioAyB;
                }
                if (diarioC == 1){
                    ++contadorDiarioAyC;
                }
            }
            if(diarioB == 1){
                if(diarioC == 1){
                    ++contadorDiarioByC;
                }
            }

        }
        System.out.println("A los 3 diarios estan suscritos " + contadorDiarioTotal + " personas.");
        System.out.println("Al diario A estan suscritos " + contadorDiarioA + " personas.");
        System.out.println("Al diario A y C estan suscritos " + contadorDiarioAyC + " personas.");
        System.out.println("Al diario A y B estan suscritos " + contadorDiarioAyB + " personas.");
        System.out.println("Al diario B y C estan suscritos " + contadorDiarioByC + " personas.");

    }
}
