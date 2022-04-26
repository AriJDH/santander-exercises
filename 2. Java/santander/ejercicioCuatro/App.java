package com.santander.ejercicioCuatro;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final double impuestoUno = 0.0245;
        final double impuestoDos = 0.15;
        final double impuestoTres = 0.03;
        double sumaImpuestos = impuestoUno+impuestoDos+impuestoTres;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el monto del premio: ");
        double premioOriginal = entrada.nextDouble();
        double descuentos = premioOriginal*sumaImpuestos;
        double premioFinal = premioOriginal-descuentos;
        System.out.println("el premio final es de : "+premioFinal);


    }
}
