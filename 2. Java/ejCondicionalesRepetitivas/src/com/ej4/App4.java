package com.ej4;

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int ENCUESTADOS = 4;
        int sus3diarios = 0;
        int susAyC = 0;
        int susAyB = 0;
        int susByC = 0;
        int susAonly = 0;

        for (int i = 0; i < ENCUESTADOS; i++) {
            boolean susA = false;
            boolean susB = false;
            boolean susC = false;
            System.out.println("encuestado n°" + (i + 1) + ":");
            System.out.println("Está suscrito a diario A? 1.Si  2.No");
            if (teclado.nextInt() == 1) {
                susA = true;
            }
            System.out.println("Está suscrito a diario B? 1.Si  2.No");
            if (teclado.nextInt() == 1) {
                susB = true;
            }
            System.out.println("Está suscrito a diario C? 1.Si  2.No");
            if (teclado.nextInt() == 1) {
                susC = true;
            }
            if (susA && susB && susC) {
                sus3diarios++;
            } else {
                if (susA && susC) {
                    susAyC++;
                } else {
                    if (susA && susB) {
                        susAyB++;
                    } else {
                        if (susB && susC) {
                            susByC++;
                        } else {
                            if (susA) {
                                susAonly++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Cantidades:");
        System.out.println("    3 diarios: " + sus3diarios);
        System.out.println("    A y B: " + susAyB);
        System.out.println("    A y C: " + susAyC);
        System.out.println("    C y B: " + susByC);
        System.out.println("    only A: " + susAonly);

    }
}
