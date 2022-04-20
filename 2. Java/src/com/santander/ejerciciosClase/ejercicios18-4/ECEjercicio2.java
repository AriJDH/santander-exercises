package com.santander.EjerciciosJava2;

import java.util.Scanner;

public class ECEjercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dni;
        double aumento=0;
        double sueldo;
        double nSueldo;
        System.out.println("Ingrese el DNI del trabajador");
        dni= teclado.next();
        System.out.println("Ingrese el sueldo actual del trabajador sin '.'");
        sueldo= teclado.nextDouble();
        if (sueldo<=20000){
            aumento=25;
        }
        if (sueldo>20000&&sueldo<=45000){
            aumento=10;
        }else if (sueldo>45000){
            aumento=5;
        }
        nSueldo=sueldo+(sueldo*(aumento/100));
        System.out.println("El trabajador con DNI: "+dni+" obtiene un "+aumento+"%, elevando su sueldo a $"+nSueldo+".");
    }
}
