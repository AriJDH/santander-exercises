package com.santander.dh;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        double impuesto1 = 2.45;
        int impuesto2 = 15;
        int impuesto3 = 3;
        double totalConImpuestos;
        Scanner enteredValueUser = new Scanner (System.in);

        System.out.println("Ingrese su valor bruto a calcular");
        int enteredValue = enteredValueUser.nextInt();

        double totalImpuesto1 = (impuesto1 * enteredValue) / 100;
        int totalImpuesto2 = (impuesto2 * enteredValue) / 100;
        int totalImpuesto3 = (impuesto3 * enteredValue) / 100;

        totalConImpuestos = enteredValue - (totalImpuesto1 + totalImpuesto2 + totalImpuesto3);

        System.out.println("Su vaor ingresado fue: " + enteredValue + ". Su valor luego del descuento de impuestos es: " + totalConImpuestos);
    }
}
