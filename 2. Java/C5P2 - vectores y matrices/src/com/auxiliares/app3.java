package com.ejercicio1;

public class app3 {
    public static void main(String[] args) {

        String alumnos[] = {"Marselo", "Carla", "Jorgelina", "Raul"};
        int notas[][] = {{4, 5, 6}, {7, 3, 10}, {8, 9, 7}, {5, 10, 7}};
        double sumaNotas = 0;
        double promedio[] = new double[alumnos.length];

        for (int x = 0; x < alumnos.length; x++) {
            for (int y = 0; y < notas[x].length; y++) {
                sumaNotas += notas[x][y];
            }
            promedio[x] = sumaNotas/notas[x].length;
            sumaNotas = 0;
        }

        for (int i = 0; i < alumnos.length; i++) {
            System.out.printf("Alumno/a: " + alumnos[i] + " tiene un promedio de: %.2f", promedio[i]);
            System.out.println("");
        }

    }
}
