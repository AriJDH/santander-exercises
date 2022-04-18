package com.santander.estructurasControl;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sueldo;
        System.out.println("ingrese sueldo del empleado");
        sueldo = entrada.nextDouble();EjercicioArrayTridimensional
        if(sueldo<20000){
            sueldo += sueldo*0.20;
            System.out.println("Le corresponde un 20%");
        }else if(sueldo>20000 && sueldo<40000){
            sueldo += sueldo*0.10;
            System.out.println("Le corresponde un 10%");
        }else{
            sueldo += sueldo*0.05;
            System.out.println("Le corresponde un 5%");
        }
        System.out.println("Su nuevo sueldo es de : " + sueldo);
    }
}
