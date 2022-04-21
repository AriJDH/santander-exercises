package com.ejercicio1;
import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cantNotas, ap = 0, rep = 0, fin = 0;
        cantNotas = input.nextInt();
        int[] notas = new int[cantNotas];

        for (int i = 0; i < cantNotas; i++){
            notas[i] = input.nextInt();
            if (notas[i] < 4) { rep++; }
            else if (notas[i] < 8) { fin++; }
            else { ap++; }
        }
        int[] repr = new int[rep];
        int[] apr = new int[ap];
        int[] fina = new int[fin];

        for (int i = 0; i < notas.length; i++){
            if (notas[i] < 4) { rep--; repr[rep] = notas[i]; }
            else if (notas[i] < 8) { ap--; apr[ap] = notas[i]; }
            else {  fin--; fina[fin] = notas[i]; }
        }

        System.out.println("Reprobados: ");
        for (int i = 0; i < repr.length; i++){
            System.out.println(repr[i]);
        }
        System.out.println("Aprobados: ");
        for (int i = 0; i < apr.length; i++){
            System.out.println(repr[i]);
        }
        System.out.println("A final: ");
        for (int i = 0; i < fina.length; i++){
            System.out.println(repr[i]);
        }
    }
}
