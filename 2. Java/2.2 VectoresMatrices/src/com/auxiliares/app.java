package com.ejercicio1;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int notas[] = new int[5];
        int sumaNotas = 0;
        double notaFinal;

        for (int i = 0; i < notas.length; i ++){
            System.out.print("Ingresar la nota " + (i + 1) + ": ");
            notas[i] = input.nextInt();
            sumaNotas += notas[i];
        }
        notaFinal = sumaNotas/notas.length;
        System.out.printf("La nota final es: %.2f", notaFinal);

    }
}
