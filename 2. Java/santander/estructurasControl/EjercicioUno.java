package com.santander.estructurasControl;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precio = 0;
        int numeroFabrica;
        final double porcentajeGanancia = 0.25;
        final double porcentajeEnvioFabricaUno = 0.07;
        final double porcentajeEnvioFabricaDos = 0.15;
        final double porcentajeEnvioFabricaTres = 0.22;
        System.out.println("ingrese el numero de la fabrica (1,2,3)");
        numeroFabrica = entrada.nextInt();

        switch (numeroFabrica) {
            case 1:
                System.out.println("ingrese precio del producto: ");
                precio = entrada.nextDouble();
                precio += porcentajeEnvioFabricaUno * precio;
                precio += precio * porcentajeGanancia;
                System.out.println("el precio final es: " + precio);
                break;
            case 2:
                System.out.println("ingrese precio del producto: ");
                precio = entrada.nextDouble();
                precio += porcentajeEnvioFabricaDos * precio;
                precio += precio * porcentajeGanancia;
                System.out.println("el precio final es: " + precio);
                break;
            case 3:
                System.out.println("ingrese precio del producto: ");
                precio = entrada.nextDouble();
                precio += porcentajeEnvioFabricaTres * precio;
                precio += precio * porcentajeGanancia;
                System.out.println("el precio final es: " + precio);
                break;
            default:
                System.out.println("codigo erroneo");
        }


    }
}
