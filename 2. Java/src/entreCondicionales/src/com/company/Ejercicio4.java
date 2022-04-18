package com.company;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suscriptos3Diarios = 0;
        int suscriptosAyC = 0;
        int suscriptosAyB = 0;
        int suscriptosByC = 0;
        int suscriptosAExc = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hola, usuario " + i + ".");
            System.out.println("¿Se encuentra suscripto al diario A? Sí -> 1, No -> 2: ");
            int diarioA = teclado.nextInt();
            System.out.println("¿Se encuentra suscripto al diario B? Sí -> 1, No -> 2: ");
            int diarioB = teclado.nextInt();
            System.out.println("¿Se encuentra suscripto al diario C? Sí -> 1, No -> 2: ");
            int diarioC = teclado.nextInt();
            if (diarioA == 1 && diarioB == 1 && diarioC == 1) {
                suscriptos3Diarios++;
                suscriptosAyB++;
                suscriptosAyC++;
                suscriptosByC++;
            }
            else if (diarioA == 1 && diarioC == 1) {
                suscriptosAyC++;
            }
            else if (diarioA == 1 && diarioB == 1) {
                suscriptosAyB++;
            }
            else if (diarioB == 1 && diarioC == 1) {
                suscriptosByC++;
            }
            else if (diarioA == 1){
                suscriptosAExc++;
            }
        }
        System.out.println("La cantidad de personas suscriptas a los 3 diarios es: " + suscriptos3Diarios + "\nLa cantidad de personas suscriptas al diario A y C es "
        + suscriptosAyC + "\nLa cantidad de personas suscriptas al diario A y B es: " + suscriptosAyB + "\nLa cantidad de personas suscriptas al diario B y C es: "
        + suscriptosByC + "\nLa cantidad de personas suscriptas únicamente al diario A es: " + suscriptosAExc + ".");
    }
}
