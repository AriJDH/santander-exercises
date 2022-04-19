package com.pruebas;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Ingresar la cantidad de notas");
        int cantidadNotas = scanner.nextInt();
        double notasAprobadas [] = new double [cantidadNotas], notasDesaprobadas [] = new double [cantidadNotas], notasRegulares [] = new double [cantidadNotas];
        int cantidadAprobados = 0, cantidadDesaprobados = 0, cantidadRegulares = 0;
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("Ingresar la nota numero " + i);
            double nota = scanner.nextDouble();
            if (nota < 4){
                notasDesaprobadas[cantidadDesaprobados] = nota;
                cantidadDesaprobados++;
            } else if (nota < 7){
                notasRegulares[cantidadRegulares] = nota;
                cantidadRegulares++;
            } else{
                notasAprobadas[cantidadAprobados] = nota;
                cantidadAprobados++;
            }
        }

        System.out.println("El promedio de las notas desaprobadas es de " + (java.util.com.pruebas.Arrays.stream(notasDesaprobadas).sum()) / cantidadDesaprobados);
        System.out.println("El promedio de las notas regulares es de " + (java.util.com.pruebas.Arrays.stream(notasRegulares).sum()) / cantidadRegulares);
        System.out.println("El promedio de las notas aprobadas es de " + (java.util.com.pruebas.Arrays.stream(notasAprobadas).sum()) / cantidadAprobados);
        */

        /*
        String alumnos [] = {"Carlos", " Maria", "Juan", "Pedro"};
        int notas [][] = {{4,5,6}, {8,9,10}, {9,9,10}, {8,5,10}};
        double promedios [] = new double[alumnos.length];
        double sumatoriaDeNotas = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sumatoriaDeNotas = sumatoriaDeNotas + notas[i][j];
            }
            //System.out.println(sumatoriaDeNotas);
            promedios[i] = sumatoriaDeNotas / 3;
            sumatoriaDeNotas = 0;
        }
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("El alumno " + alumnos[i] + " tiene un promedio de " + promedios[i]);

        }

         */

    }
}
