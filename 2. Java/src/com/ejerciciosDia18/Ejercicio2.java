package com.ejerciciosDia18;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int dni;
        double sueldo;

        System.out.println("Ingrese el DNI");
        dni = scann.nextInt();
        System.out.println("Ingrese el sueldo");
        sueldo = scann.nextDouble();

        if (sueldo <= 20000){
            System.out.println("Al empleado con DNI: " + dni + " le corresponde un aumento del %20 " );
            System.out.println("Sueldo final correspondiente: " + (sueldo + (sueldo * 0.20)));
        }else if (sueldo <= 45000){
            System.out.println("Al empleado con DNI: " + dni + " le corresponde un aumento del %10 " );
            System.out.println("Sueldo final correspondiente: " + (sueldo + (sueldo * 0.10)));
        }else{
            System.out.println("Al empleado con DNI: " + dni + " le corresponde un aumento del %5 " );
            System.out.println("Sueldo final correspondiente: " + (sueldo + (sueldo * 0.05)));
        }
    }
}
