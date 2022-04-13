package com.bootcamp;

import java.util.Scanner;

public class Ejercicio3 {
    private final int COSTO_POR_DIA = 2;

    public void ejecutar() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantdad de dias que dura la campaña: ");
        int dias = teclado.nextInt();
        int costo_total = COSTO_POR_DIA * dias;
        System.out.print(dias + " dias de campaña -> " + costo_total);
        teclado.close();
    }
}
