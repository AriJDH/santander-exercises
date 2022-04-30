package com.Ejercicios.practicos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de dias que solicita la campaña");
        Scanner scanner = new Scanner(System.in);
        int cantidadDias = scanner.nextInt();
        int campañaValorPorDia = 2;
        int valorCampaña = campañaValorPorDia * cantidadDias;
        System.out.println("Su valor estimado es: $ " + valorCampaña);

    }
}
