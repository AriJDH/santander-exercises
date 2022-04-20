package com.ejercicios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
        consigna
        tomar de teclado
        Lista de notas
        lista de alumnos

        lista de alumnos promocionados / a final (+7)
         */

        List<Integer> notas = new ArrayList<>();
        List<String> alumnos = new ArrayList<>();
        List<String> alumnosPromocionados = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int notaTeclado;
        String alumnoTeclado = "";

        System.out.println("INGRESE UN ALUMNO (para salir ingrese salir)");
        alumnoTeclado = scanner.next();
        while (!alumnoTeclado.equalsIgnoreCase("salir")) {
            alumnos.add(alumnoTeclado);
            System.out.println("INGRESANDO NOTA DEL ALUMNO");
            notaTeclado = scanner.nextInt();
            notas.add(notaTeclado);
            System.out.println("INGRESE UN ALUMNO (para salir ingrese salir)");
            alumnoTeclado = scanner.next();
        }

        System.out.println("ANOTANDO LOS ALUMNOS QUE PROMOCIONAN");

        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) > 7) {
                alumnosPromocionados.add(alumnos.get(i));
            }
        }

        System.out.println("LOS ALUMNOS QUE PROMOCIONARON SON");
        for (String alumno : alumnosPromocionados) {
            System.out.println(alumno);

        }
        scanner.close();

    }
}
