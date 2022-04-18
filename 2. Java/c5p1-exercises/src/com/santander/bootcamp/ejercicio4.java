package com.santander.bootcamp;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cant_A=0, cant_AC=0, cant_AB=0, cant_BC=0, cant_ABC=0;
        boolean a=false, b=false, c=false;
        char ch;

        for (int i=0; i<3; ++i) {

            System.out.println("¿Está suscrito al diario A? (s/n)");
            ch = input.next().charAt(0);
            if (ch == 's' || ch == 'S') {
                ++cant_A;
                a=true;
                ch = 'n';
            }

            System.out.println("¿Está suscrito al diario B?");
            ch = input.next().charAt(0);
            if (ch == 's' || ch == 'S') {
                b=true;
                ch = 'n';
            }

            System.out.println("¿Está suscrito al diario C?");
            ch = input.next().charAt(0);
            if (ch == 's' || ch == 'S') {
                c=true;
                ch = 'n';
            }

            if (a && b) {
                ++cant_AB;
            }
            if (a && c) {
                ++cant_AC;
            }
            if (b && c) {
                ++cant_BC;
            }
            if (a && b && c) {
                ++cant_ABC;
            }

            a=false; b=false; c=false;
        }

        System.out.println("Cantidad suscritos a los 3 diarios: " + cant_ABC);
        System.out.println("Cantidad suscritos a los diarios A y C: " + cant_AC);
        System.out.println("Cantidad suscritos a los diarios A y B: " + cant_AB);
        System.out.println("Cantidad suscritos a los diarios B y C: " + cant_BC);
        System.out.println("Cantidad suscritos al diario A: " + cant_A);
    }
}
