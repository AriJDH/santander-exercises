package com.auxiliar;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> notas = new ArrayList<>();
        List<String> nombres = new ArrayList<>();
        List<String> aprobados = new ArrayList<>();
        int cantAlumnos;
        int x = 0;

        System.out.print("Indique la cantidad de alumnos: ");
        cantAlumnos = input.nextInt();

        for (int i = 0; i < cantAlumnos; i++) {
            System.out.print("Nombre: ");
            nombres.add(input.next());
            System.out.print("Nota: ");
            notas.add(input.nextInt());
        }

        for (int i = 0; i < cantAlumnos; i++) {
            if (notas.get(i) >= 7){
                aprobados.add(nombres.get(i));
                System.out.println(aprobados.get(x));
                x ++;
            }
        }

    }
}
