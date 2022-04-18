package com.santander.sistema;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int cantidadDias;
        final double precio = 2;
        System.out.println("Ingrese la cantidad de dias a cubrir");
        Scanner scanner = new Scanner(System.in);
        cantidadDias = scanner.nextInt();
        System.out.println("El costo de la campaña es de: $"+(cantidadDias*precio));


    }
}
