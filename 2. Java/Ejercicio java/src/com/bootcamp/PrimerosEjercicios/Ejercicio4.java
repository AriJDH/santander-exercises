package com.bootcamp.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el monto: ");
        int monto = teclado.nextInt();
        float impuestoUno = 0.0245f;
        float impuestoDos = 0.15f;
        float impuestoTres = 0.03f;
        double montoImpuestos = monto * (1- (0.03f + 0.0245f + 0.15f));

        System.out.println("El monto total luego de los impuestos es: $" + montoImpuestos);

    }
}
