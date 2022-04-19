package com.santander.sistema;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double resultado = ejercicio_3(8);
        System.out.println(resultado);
        double resultado1 = ejercicio_4(23563899);
        System.out.println(resultado1);
    }
    public static double ejercicio_3(int cant_Dias) {
        final double precio = 2;
        return precio * cant_Dias;
    }
    public static double ejercicio_4(double monto_bruto) {
        double impuesto1 = 2.45;
        double impuesto2 = 15;
        double impuesto3 = 3;
        double suma = impuesto1 + impuesto2 + impuesto3;
        return (suma * monto_bruto) / 100;
    }
}
