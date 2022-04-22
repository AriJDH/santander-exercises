package com.santanderbootcamp.C5P1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int conCamaras = 7;
        int conPatrullaje;
        double costo;
        System.out.print("Ingrese la cantidad de clientes tienen servicio de patrullaje: ");
        conPatrullaje = teclado.nextInt();
        for(int i = 1; i <= conCamaras; i++) {
            costo = 1500.0;
            if (conPatrullaje != 0) {
                costo += 700.0;
                conPatrullaje--;
            }
            if ((int)costo == 1500) {
                System.out.printf("El cliente número %d tiene contratado el Servicio 1 con un costo de %.2f\n", i, costo);
            }
            else {
                System.out.printf("El cliente número %d tiene contratado el Servicio 2 con un costo de %.2f\n", i, costo);
            }
        }
    }
}
