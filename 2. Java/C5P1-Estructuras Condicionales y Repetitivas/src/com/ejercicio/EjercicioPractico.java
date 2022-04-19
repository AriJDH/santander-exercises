package com.ejercicio;

import java.util.Scanner;

public class EjercicioPractico {
    public static void main(String[] args) {
        //EJERCICIO1 :
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nº de fabricante: ");
        int fabricante = scanner.nextInt();
        ejercicio1(fabricante);

        //EJERCICIO2:
        double resultado = ejercicio2(94065255, 80000);
        System.out.println("El total del aumento es: " + resultado);

        //EJERCICIO3:
        ejercicio3();

        //EJERCICIO4:
        ejercicio4();
    }

    public static void ejercicio1(int fabricante) {
        switch (fabricante) {
            case 1:
                double resultado = calcular_precio_venta(0.07);
                System.out.println(resultado);
                break;
            case 2:
                resultado = calcular_precio_venta(0.15);
                System.out.println(resultado);
                break;
            case 3:
                resultado = calcular_precio_venta(0.22);
                System.out.println(resultado);
                break;
            default:
                System.out.println("No existe el fabricante");
                break;
        }

    }
    public static double calcular_precio_venta(double porcentaje_envio) {
        final int precio_costo = 800;
        final double porcentaje_ganancia = 0.25;

        double precio_envio = (precio_costo * porcentaje_envio) + precio_costo;
        double precio_venta = (precio_envio * porcentaje_ganancia) + precio_envio;
        return precio_venta;
    }

    public static double ejercicio2(int dni, double sueldo) {
        double aumento;
        if ((int)sueldo <= 20000) {
            aumento = (sueldo * 0.20) + sueldo;
        }
        else {
            if ((int)sueldo > 20000 && (int)sueldo <= 45000) {
                aumento = (sueldo * 0.1) + sueldo;
            }
            else {
                aumento = (sueldo * 0.5) + sueldo;
            }
        }
        return aumento;
    }

    public static void ejercicio3() {
        for (int i=1; i < 7; i++) {
            if (i % 2 == 0){  //clientes pares
                System.out.println("El cliente " + i + " tiene  el monto total de: " + calcular_servicio((2)));
            }
            else { //clientes impares
                System.out.println("El cliente " + i + "tiene  el monto total de: " + calcular_servicio((1)));
            }
        }
    }
    public static int calcular_servicio(int servicio) {
        final int camaras = 1500;
        final int patrullaje = 1500;
        final int serv_patrullaje = 700;

        if (servicio == 1) {
            return camaras;
        }
        else {
            return camaras + patrullaje + serv_patrullaje;
        }

    }

    public static void ejercicio4() {

    }
}
