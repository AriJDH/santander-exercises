package com.ej2;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese sueldo: ");
        double sueldo= teclado.nextDouble();
        if (sueldo<=20000){
            System.out.println("le corresponde un 20% de aumento");
        }else{
            if ((sueldo>20000) && (sueldo<=45000)){
                System.out.println("le corresponde un 10% de aumento");
            }
            else{
                System.out.println("le corresponde un 5% de aumento");
            }
        }
    }
}
