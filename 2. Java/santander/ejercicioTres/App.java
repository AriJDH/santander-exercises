package com.santander.ejercicioTres;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final double precio = 2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cantidad de dias de la campaña: ");
        int dias = entrada.nextInt();
        System.out.println("el costo total de la campaña es de : $ " + (precio*dias));


    }
}
