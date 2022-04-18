package com.bootcamp.C5P1;

import java.util.Scanner;

public class EjercicioC5P1_1 {
    private final int FABRICA_1 = 1;
    private final int FABRICA_2 = 2;
    private final int FABRICA_3 = 3;
    private final float MULTIPLICADOR_GANANCIA = 1.25f;
    private final float MULTIPLICADOR_COSTO_ENVIO_F1 = 0.07f;
    private final float MULTIPLICADOR_COSTO_ENVIO_F2 = 0.15f;
    private final float MULTIPLICADOR_COSTO_ENVIO_F3 = 0.22f;

    public void ejecutar(){
        float costo_producto = 0;
        int numero_fabrica = FABRICA_1;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese costo del producto: ");
        costo_producto = teclado.nextFloat();
        System.out.print("Ingrese numero de la fabrica: ");
        numero_fabrica = teclado.nextInt();

        float multiplicador_costo_de_envio = 0;
        switch(numero_fabrica){
            case FABRICA_1:
                multiplicador_costo_de_envio = MULTIPLICADOR_COSTO_ENVIO_F1;
                break;
            case FABRICA_2:
                multiplicador_costo_de_envio = MULTIPLICADOR_COSTO_ENVIO_F2;
                break;
            case FABRICA_3:
                multiplicador_costo_de_envio = MULTIPLICADOR_COSTO_ENVIO_F3;
                break;
            default:
                System.out.println("Debe ingresar un numero entre 1 y 3, default a Fabrica 1");
                break;
        }

        float costo_producto_envio = costo_producto + costo_producto * multiplicador_costo_de_envio;

        float precio_venta = costo_producto_envio * MULTIPLICADOR_GANANCIA;

        System.out.println("El precio de venta es: " + precio_venta);
    }
}
