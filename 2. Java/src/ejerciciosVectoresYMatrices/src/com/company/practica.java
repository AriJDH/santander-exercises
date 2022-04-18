package com.company;
import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
        int numeros[] = {2,45,32,3,4};
        for (int i = 0; i<numeros.length; i++) {
            System.out.println("Número "+numeros[i]);
        }
        promediosMatriz();
    }
    public static void listaNotas() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas notas quiere promediar?");
        int cantidadNotas = teclado.nextInt();
        double notas[] = new double [cantidadNotas];
        for (int i=0; i<cantidadNotas; i++) {
            System.out.println("Ingrese una nota: ");
            notas[i] = teclado.nextInt();
        }
        double resultado = 0;
        for (int i=0; i<cantidadNotas; i++) {
            resultado = notas[i];
        }
        resultado = resultado/cantidadNotas;
    }
    public static void listaNotasSeparadas() {
        Scanner teclado = new Scanner(System.in);
        int cantidadPromocionados = 0;
        int cantidadAprobados = 0;
        int cantidadDesaprobados = 0;
        System.out.println("¿Cuántas notas quiere introducir?");
        int cantidadNotas = teclado.nextInt();
        double notas[] = new double [cantidadNotas];
        for (int i=0; i<cantidadNotas; i++) {
            System.out.println("Ingrese una nota: ");
            notas[i] = teclado.nextInt();
            if (notas[i] < 4) {
                cantidadDesaprobados++;
            }
            else if (notas[i] < 7) {
                cantidadAprobados++;
            }
            else {
                cantidadPromocionados++;
            }
        }
        double promocionados[] = new double [cantidadPromocionados];
        double aprobados[] = new double [cantidadAprobados];
        double desaprobados[] = new double [cantidadDesaprobados];
        int contadorDesaprobados = 0;
        int contadorAprobados = 0;
        int contadorPromocionados = 0;
        double sumaAprobados=0, sumaDesaprobados=0, sumaPromocionados=0;
        for (int i=0; i<cantidadNotas; i++) {
            if (notas[i] < 4) {
                desaprobados[contadorDesaprobados] = notas[i];
                contadorDesaprobados++;
                sumaDesaprobados = sumaDesaprobados + notas[i];
            }
            else if (notas[i] < 7) {
                aprobados[contadorAprobados] = notas[i];
                contadorAprobados++;
                sumaAprobados = sumaAprobados + notas[i];
            }
            else {
                promocionados[contadorPromocionados] = notas[i];
                contadorPromocionados++;
                sumaPromocionados = sumaPromocionados + notas[i];
            }
        }
        System.out.println("El promedio de los promocionados es " + sumaPromocionados/cantidadPromocionados + "\nEL promedio de los aprobados es: " +
                sumaAprobados/cantidadAprobados + "\nEl promedio de los desaprobados es :" + sumaDesaprobados/cantidadDesaprobados);
    }
    public static void promediosMatriz() {
        String alumnos[] = {"Carlos", "Maria", "Juan", "Pedro"};
        int notas[][] = {{4,5,6}, {8,9,10},{9,9,10},{8,5,10}};
        int promedio = 0;
        for (int f = 0; f<alumnos.length; f++) {
            for (int c=0; c<alumnos[f].length();c++) {
                promedio = promedio + notas[f][c];
            }
            System.out.println("El promedio de " + alumnos[f] + " es " + promedio/3);
            promedio = 0;
        }
    }

    public static void opcion2() {
        Scanner scanner = new Scanner(System.in);

        String alumnos[] = {"Carlos", "Maria", "Juan", "Pedro"};

        int notas[][] = {{4,5,6}, {8,9,10}, {9,9,10}, {8,5,10}};

        for(int i = 0; i < alumnos.length; i++) {

            System.out.println("Alumno: " + alumnos[i]);
            double sum_notas = 0;
            for (int j = 0; j < notas[i].length; j++) {
                sum_notas += notas[i][j];
            }
            System.out.println("    Promedio: " + sum_notas / 3);
        }
    }
}
