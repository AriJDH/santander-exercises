package com.santanderbootcamp.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double premioBruto;
        double premioFinal;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el monto bruto del premio: $");
        premioBruto = entrada.nextDouble();
        premioFinal = premioBruto - premioBruto * 0.0245 - premioBruto * 0.15 - premioBruto * 0.03;
        System.out.printf("El monto final que corresponde según los descuentos es $%.2f", premioFinal);
        entrada.close();
    }
}
