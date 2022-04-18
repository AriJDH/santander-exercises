package com;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int precioFijo = 1500;
        int servicioPatrullaje = 700;

        float factura = 0;
        Scanner servicio = new Scanner(System.in);
        System.out.println("Ingresar el servicio a facturar: ");
        int numeroServicio = servicio.nextInt();
        if(numeroServicio == 1){
            factura = precioFijo;
        }else if(numeroServicio == 2){
            factura =precioFijo + servicioPatrullaje;
        }else{
            System.out.println("El numero de servicio es incorrecto");
        }
        System.out.println("El monto final de la factura es de: " + factura);
        }
    }

