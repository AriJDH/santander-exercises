package com.company;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        //Ejercicio2:
        int proxEmpleado;
        do {
            double nuevoSueldo;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el DNI del empleado a evaluar: ");
            int dni = teclado.nextInt();
            System.out.println("Ingrese el sueldo del empleado: ");
            int sueldo = teclado.nextInt();
            if (sueldo <= 20000) {
                nuevoSueldo = sueldo * 1.2;
            } else if (sueldo <= 45000) {
                nuevoSueldo = sueldo * 1.10;
            } else {
                nuevoSueldo = sueldo * 1.05;
            }
            System.out.println("El nuevo salario del empleado " + dni + " es " + nuevoSueldo);
            System.out.println("¿Desea agregar otro empleado? Sí -> 1, No -> 2");
            proxEmpleado = teclado.nextInt();
        } while (proxEmpleado == 1);
    }
}
