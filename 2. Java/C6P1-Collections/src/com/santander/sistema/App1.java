package com.santander.sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        //Consigna
        //Tomar datos por teclado
        //lista de notas (Integer)
        //lista de alumnos
        //nueva lista de alumnos a final mas de 7
        List<Integer> lista_notas = cargar_notas();
        List<String> lista_alumnos = cargar_alumnos(lista_notas.size());
        System.out.println(lista_notas);
        System.out.println(lista_alumnos);

        List<String> alumnos_promocionados = new ArrayList<>();
        int una_nota;
        for (int i=0; i < lista_notas.size(); i++) {
            una_nota = lista_notas.get(i);
            if (una_nota > 7) {
                alumnos_promocionados.add(lista_alumnos.get(i));
            }
        }
        System.out.println(alumnos_promocionados);
    }

    public static List<Integer> cargar_notas() {
        List<Integer> notas = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una nota (0 para terminar): ");
        int nota = scanner.nextInt();

        while (nota != 0) {
            notas.add(nota);
            System.out.print("Ingrese una nota (0 para terminar): ");
            nota = scanner.nextInt();
        }
        return notas;
    }

    public static List<String> cargar_alumnos(int tamanio) {
        List<String> alumnos = new ArrayList();
        String nombre;
        for (int i=0; i<tamanio; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese nombre del alumno (faltan "+ (tamanio-i)+" alumnos): ");
            nombre = scanner.nextLine();
            alumnos.add(nombre);
        }
        return alumnos;
    }
}
