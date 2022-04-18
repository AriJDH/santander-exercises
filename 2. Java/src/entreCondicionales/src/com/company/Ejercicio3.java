package com.company;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            System.out.println("Hola, cliente "+i+".");
            System.out.println("Seleccione el servivio a abonar (Servicio 1 -> 1, Servicio 2 -> 2): ");
            int servicio = teclado.nextInt();
            int montoFinal;
            switch (servicio) {
                case 1:
                    System.out.println("El monto final es de $1500.");
                    break;
                case 2:
                    System.out.println("El monto final es de $2200.");
            }
        }
    }
}
