package com.ejercicio;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double promedio;
        double suma = 0;
        int aprobo;
        double[] notas = new double[3];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("ingrese nota " + (i + 1));
            notas[i] = entrada.nextDouble();
            suma += notas[i];
        }
        promedio = suma / notas.length;
        if (promedio > 7) {
            aprobo = 1;
        } else {
            aprobo = 0;
        }
        switch (aprobo) {
            case 0:
                System.out.printf("reprobado");
                break;
            case 1:
                System.out.printf("aprobado");
                break;
        }

    }
}
