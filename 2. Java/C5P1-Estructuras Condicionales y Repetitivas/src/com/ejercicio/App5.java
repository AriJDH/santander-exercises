package com.ejercicio;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        // ingresar notas tipo double (sin listas)
        // y calcular el promedio
        //promedio aprobados entre 4 y 7
        //promedio a final mas de 7
        //promedio desaprobados menos de 7

        double suma = 0;
        int contador = 0;
        double promedio;
        boolean centinela = true;
        while (centinela) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese una nota (0 para terminar): ");
            double nota = scanner.nextDouble();
            if (nota == 0) {
                centinela = false;
                promedio = suma / contador;
                int resultado = (int)promedio;
                if (resultado < 4) {
                    if (resultado > 4 && resultado < 7) {
                        System.out.println("Aprobado");
                    }
                    else {
                        System.out.println("Final");
                    }
                }
            }
            suma = suma + nota;
            contador += 1;
        }
    }
}
