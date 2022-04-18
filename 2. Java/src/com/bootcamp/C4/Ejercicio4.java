package com.bootcamp.C4;

import java.util.Scanner;

public class Ejercicio4 {

    public void ejecutar() {
        final float IMPUESTO_1 = 0.0245F;
        final float IMPUESTO_2 = 0.15F;
        final float IMPUESTO_3 = 0.03F;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el monto del premio: ");

        float premio_total = teclado.nextFloat();
        float descuentos = premio_total * IMPUESTO_1 + premio_total * IMPUESTO_2 + premio_total * IMPUESTO_3;

        System.out.println("Su monto total neto es: " + Float.toString(premio_total - descuentos));
        teclado.close();
    }
}
