package com.bootcamp.clase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EjerciciosCollections {
    public void ejercicio_array_lists() {
        List<String> nombres = new ArrayList<>();

        nombres.add("Jorge");


        List<String> nombres_link = new LinkedList<>();

        nombres_link.add("Zelda");


        nombres_link.add(1, "Link");
        nombres_link.remove(1);
        nombres.add(0,"Carlos");

        for (String nombre: nombres) {
            System.out.println("Nombre: " + nombre);
        }

        for (int i = 0; i < nombres_link.size(); i++) {
            System.out.println(nombres_link.get(i));
        }
    }

    public void ejercicio_lista_notas_alumnos() {
        boolean seguir = true;
        String nombre_alumno = "";
        int nota = 0;
        List<String> nombres = new ArrayList<>();
        List<Integer> notas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        while(seguir){
            System.out.print("Ingrese nombre del alumno (ingrese Q para terminar): ");
            nombre_alumno = teclado.next();
            seguir = !nombre_alumno.equalsIgnoreCase("q");
            if (seguir){
                System.out.print("Ingrese nota del alumno: ");
                nota = teclado.nextInt();
                nombres.add(nombre_alumno);
                notas.add(nota);
            }
        }

        List<String> nombres_desaprobados = new ArrayList<>();
        List<String> nombres_a_final = new ArrayList<>();
        List<String> nombres_promociona = new ArrayList<>();
        for (int i = 0; i < nombres.size(); i++) {
            if(notas.get(i) < 4){
                nombres_desaprobados.add(nombres.get(i));
            } else if (notas.get(i) < 7){
                nombres_a_final.add(nombres.get(i));
            } else {
                nombres_promociona.add(nombres.get(i));
            }
        }

        System.out.println("A final: ");
        for (int i = 0; i < nombres_desaprobados.size(); i++) {
            System.out.print(nombres_a_final.get(i));
        }
    }
}
