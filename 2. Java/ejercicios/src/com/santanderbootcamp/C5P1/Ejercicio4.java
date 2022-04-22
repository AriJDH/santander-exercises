package com.santanderbootcamp.C5P1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean suscriptoDiarioA = false;
        boolean suscriptoDiarioB = false;
        boolean suscriptoDiarioC = false;
        int suscriptosSoloDiarioA = 0;
        int suscriptosSoloDiarioB = 0;
        int suscriptosSoloDiarioC = 0;
        int suscriptosDiariosABC = 0;
        int suscriptosDiariosAB = 0;
        int suscriptosDiariosBC = 0;
        int suscriptosDiariosAC = 0;
        for(int i = 1; i <= 5; i++) {
            System.out.println("Participante Número " + i + "/50 de la encuesta:");
            System.out.print(" Esta suscripto al Diario A (1 para confirmar): ");
            if (teclado.nextInt() == 1) suscriptoDiarioA = true;
            System.out.print(" Esta suscripto al Diario B (1 para confirmar): ");
            if (teclado.nextInt() == 1) suscriptoDiarioB = true;
            System.out.print(" Esta suscripto al Diario C (1 para confirmar): ");
            if (teclado.nextInt() == 1) suscriptoDiarioC = true;
            if (suscriptoDiarioA && suscriptoDiarioB && suscriptoDiarioC) {
                suscriptosDiariosABC++;
            }
            else if (suscriptoDiarioA && suscriptoDiarioB) {
                suscriptosDiariosAB++;
            }
            else if (suscriptoDiarioA && suscriptoDiarioC) {
                suscriptosDiariosAC++;
            }
            else if (suscriptoDiarioB && suscriptoDiarioC) {
                suscriptosDiariosBC++;
            }
            else if (suscriptoDiarioA) {
                suscriptosSoloDiarioA++;
            }
            else if (suscriptoDiarioB) {
                suscriptosSoloDiarioB++;
            }
            else if (suscriptoDiarioC) {
                suscriptosSoloDiarioC++;
            }
            suscriptoDiarioA = false;
            suscriptoDiarioB = false;
            suscriptoDiarioC = false;
        }
        System.out.println("Suscriptos a los 3 diarios: " + suscriptosDiariosABC);
        System.out.println("Suscriptos al Diario A y al Diario C: " + suscriptosDiariosAC);
        System.out.println("Suscriptos al Diario A y al Diario B: " + suscriptosDiariosAB);
        System.out.println("Suscriptos al Diario B y al Diario C: " + suscriptosDiariosBC);
        System.out.println("Suscriptos sólo al Diario A: " + suscriptosSoloDiarioA);
    }
}
