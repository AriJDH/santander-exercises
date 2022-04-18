package com.santander.dh;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner dniIngresado = new Scanner (System.in);
        Scanner montoIngresado = new Scanner (System.in);
        String dni ="";
        double sueldo;
        double sueldoTotal;

        System.out.println("Ingrese su DNI");
        dni = dniIngresado.nextLine();

        System.out.println("Ingrese su sueldo");
        sueldo = montoIngresado.nextDouble();

        if(sueldo <= 20000){
            sueldoTotal = sueldo + ((sueldo * 20)/100);
        } else if(sueldo > 20000 && sueldo < 45000){
            sueldoTotal = sueldo + ((sueldo * 10)/100);
        } else{
            sueldoTotal = sueldo + ((sueldo * 5)/100);
        }
        System.out.println("Su sueldo con aumento será: " + sueldoTotal);
    }
}
