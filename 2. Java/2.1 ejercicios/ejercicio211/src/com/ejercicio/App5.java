package com.ejercicio;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        boolean masNotas = true;
        double sumaNotas = 0;
        int cantidadNotas = 0;
        do {
            System.out.println("Ingresar nota (-1 Fin)");
            sumaNotas = sumaNotas + scann.nextDouble();
            cantidadNotas++;
            System.out.println("¿Desea ingresar otra nota? 1. Si; 2. No");
            if (scann.nextInt() == 2){
                masNotas = false;
            }
        }while(masNotas);

        double promedio = sumaNotas / cantidadNotas;
        System.out.println("El promedio de las notas es: " + promedio);
    }


}

