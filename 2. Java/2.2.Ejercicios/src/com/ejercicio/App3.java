package com.ejercicio;

public class App3 {

    public static void main(String[] args) {

        //String alumnos[] = {"Carlos", "Maria" ,"Juan", "Pedro"};

        //int notas[][] = {{4,5,6},{8,9,10},{9,9,10},{8,5,10}};

        //
        //  sin tomar datos del teclado
        //  promedio de cada alumno ?
        //  imprimir el promedio de cada alumno en pantalla
        //

        String alumnos[]={"carlos","juan"};
        int notas[][]={{4,5,6},{8,9,10}};

        // calcularPorAlumno(...)

        for (int i = 0; i < notas.length; i++) {
            double prom= calcularProm(notas[i]);
            System.out.println("el promedio de " + alumnos[i] +" es "+ prom);
        }

    }

    static double calcularProm(int[] numeros) {
        double acum = 0;
        for (int i = 0; i < numeros.length; i++) {
            acum = acum + numeros[i];
        }
        if (numeros.length != 0) {
            return acum / numeros.length;
        } else {
            return 0;
        }
    }

}
