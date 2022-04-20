package com.ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App1 {

    public static void main(String[] args) {

        //
        // consigna
        // tomar datos del teclado
        // lista de notas    <Integer>
        // lista de alumnos
        //
        // nueva lista de alumnos a final mas 7
        //


        Scanner entrada = new Scanner(System.in);
        List<Integer> notas = new ArrayList<>();
        List<String> nombreAlumnos = new ArrayList<>();
        List<String> nombresAprobados = new ArrayList<>();
        int opcion;
        do {
            System.out.println("ingrese el nombre del alumno: ");
            nombreAlumnos.add(entrada.nextLine());
            System.out.println("ingrese nota del estudiante:");
            notas.add(entrada.nextInt());
            System.out.println("ingrese 0 para finalizar o 1 para continuar ");
            opcion = entrada.nextInt();
            entrada.nextLine();
        } while (opcion != 0);


        for (int i = 0; i <nombreAlumnos.size() ; i++) {
            if(notas.get(i)>=7){
                nombresAprobados.add(nombreAlumnos.get(i));
            }
        }

        for (String nombre:
                nombresAprobados) {
            System.out.println(nombre);
        }




        /*
        ArrayList<Integer> notas = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> promocionados = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese limite: ");
        int limite= teclado.nextInt();
        for (int i = 0; i < limite; i++) {
            notas.add(teclado.nextInt());
        }
        for (int i = 0; i < limite; i++) {
            nombres.add(teclado.next());
        }
        for (int i = 0; i < limite; i++) {
            if (notas.get(i)>=7){
                promocionados.add(nombres.get(i));
            }
        }
        for (String nombre: promocionados) {
            System.out.println(nombre);
        }
        */

    }
}
