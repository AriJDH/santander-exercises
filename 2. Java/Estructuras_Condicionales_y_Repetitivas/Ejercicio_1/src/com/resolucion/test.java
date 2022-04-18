package com.resolucion;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese precio de costo del articulo \n");
        double precioCosto=scanner.nextDouble();
        System.out.println("Ingrese la fabrica del articulo\n");
        int fabrica= scanner.nextInt();
        while(fabrica>3 || fabrica<1){
            System.out.println("Ingrese la fabrica del articulo\n");
            fabrica= scanner.nextInt();
        }

        double porcentajeDeEnvio;

        switch (fabrica){
            case 1:
                porcentajeDeEnvio=precioCosto*0.07;
                break;
            case 2:
                porcentajeDeEnvio=precioCosto*0.15;
                break;
            case 3:
                porcentajeDeEnvio=precioCosto*0.22;
                break;
            default:
                porcentajeDeEnvio=0;
                System.out.println("Fabrica invalida");
                break;
        }
        double porcentajeDeGanancia=(precioCosto+porcentajeDeEnvio)*0.25;
        double precioDeVenta=precioCosto+porcentajeDeEnvio+porcentajeDeGanancia;
        System.out.println("El precio de venta del articulo es de \t $"+precioDeVenta);

    }
}
