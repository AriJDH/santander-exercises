package com.santanderbootcamp.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int dias;
        int total;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de días: ");
        dias = entrada.nextInt();
        total = dias * 2;
        System.out.println(dias + " días de campaña -> $2 * " + dias + " = $" + total);
    }
}
