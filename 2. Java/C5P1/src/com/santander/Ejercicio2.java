package com.santander;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su DNI: ");
        int dni = teclado.nextInt();

        System.out.println("Ingrese su sueldo: ");
        float sueldo = teclado.nextInt();

        if (sueldo <= 20000){
            System.out.println("Le corresponde un aumento del 20%");
        } else if (sueldo <= 45000){
            System.out.println("Le corresponde un aumento del 10%");
        } else if (sueldo >45000){
            System.out.println("Le corresponde un aumento del 5%");
        }

    }
}
