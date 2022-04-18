package com.ejercicio;

public class App2 {
    public static void main(String[] args) {
        //
        // Consigna
        // cargar una lista de notas
        // Crear 3 listas con las notas
        // a final, aprobados y desaprobados
        // y el promedio de cada lista
        //
        //
        // 4,5,10,2,2
        // a final {10}
        // aprobados {4,5}
        // reprobados {2,2}
        //

        int numeros[][] = {{4,5,6},{8,9,10},{12,15,10}};

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Numeros " + numeros[f][c] );
            }
        }


    }
}
