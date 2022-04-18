package com.primerProyecto;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de dias a calcular");
        int quantityDays = days.nextInt();
        int usd = 2;
        int total = usd * quantityDays;
        System.out.println("El monto total es de: " + total);
    }

}