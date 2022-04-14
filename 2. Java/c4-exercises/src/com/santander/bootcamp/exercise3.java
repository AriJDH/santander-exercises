package com.santander.bootcamp;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dias:");
        int cantidadDeDias = input.nextInt();
        System.out.println("Costo total de la campaña: $" + cantidadDeDias*2);
    }
}
