package com.bootcamp.C5P1;

import java.util.Scanner;

public class EjercicioC5P1_3 {
    private final String MENSAJE_SERVICIO_1 = "Seguridad con cámaras - Precio Fijo de $1500 al mes";
    private final String MENSAJE_SERVICIO_2 = "Seguridad con cámaras + patrullaje - Precio de $1500 + $700 por el servicio de patrullaje";
    private final int CANTIDAD_DE_CLIENTES = 7;
    private final int CODIGO_SERVICIO_1 = 1;
    private final int CODIGO_SERVICIO_2 = 2;

    public void ejecutar() {
        Scanner teclado = new Scanner(System.in);
        float TOTAL_SERVICIO_1 = 1500f;
        float TOTAL_SERVICIO_2 = 2200f;

        for (int i = 0; i < CANTIDAD_DE_CLIENTES; i++) {
            System.out.println("Indique el tipo de servicio para el cliente " + i);
            int codigo_servicio = teclado.nextInt();
            if (codigo_servicio == CODIGO_SERVICIO_1){
                System.out.println(MENSAJE_SERVICIO_1 + " - Total a pagar - $" + TOTAL_SERVICIO_1);
            } else if (codigo_servicio == CODIGO_SERVICIO_2) {
                System.out.println(MENSAJE_SERVICIO_2 + " - Total a pagar - $" + TOTAL_SERVICIO_2 );
            }
        }
    }
}
