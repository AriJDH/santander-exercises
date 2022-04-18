package com.ejercicio;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {








        /*
        int numero = 10;
        if( numero > 10) {
            System.out.println("Mayor que diez");
        } else {
            System.out.println("Menor que diez");
        }
        */
        // Consigna
        // Notas de alumnos
        // Ingresar tres notas por teclado de calificaciones (double)
        // Realizar el promedio
        // 1-4 recursa
        // entre 4 y 7 va a final
        // mas de 7 promociona

        Scanner teclado = new Scanner(System.in);
        System.out.println("Nota 1: ");
        double nota1= teclado.nextDouble();
        System.out.println("Nota 2: ");
        double nota2= teclado.nextDouble();
        System.out.println("Nota 3: ");
        double nota3= teclado.nextDouble();
        double prom= (nota1+nota2+nota3)/3;
        if (prom<4){
            System.out.println("recursa");
        }else{
            if(prom<7){
                System.out.println("vas a final");
            }else{
                System.out.println("promocionaste");
            }
        }

        //
        // consigna reemplar estructura condicional con switch
        // algo
        //



    }

}
