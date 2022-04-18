package com.santander.bootcamp;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String alumnos[] = {"Carlos", "Maria", "Juan", "Pedro"};

        int notas[][] = {{4,5,6}, {8,9,10}, {9,9,10}, {8,5,10}};

        for(int i = 0; i < alumnos.length; i++){

            System.out.println("Alumno: " + alumnos[i]);
            double sum_notas = 0;
            for (int j = 0; j < notas[i].length; j++){
                sum_notas += notas[i][j];
            }
            System.out.println("    Promedio: " + sum_notas/3);
        }

    }
}
