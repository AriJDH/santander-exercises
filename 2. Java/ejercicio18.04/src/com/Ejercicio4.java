package com;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner  cantidad = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas encuestadas: ");
        int  cantidadPersonas = cantidad.nextInt();
        int a_c = 0;
        int a_b = 0;
        int b_c = 0;
        int todos = 0;
        for(int i = 0; i < cantidadPersonas; i++){

            Scanner  diario = new Scanner(System.in);
            System.out.println("Estas suscripto al diario A? ( 1 Si/ 2 No)");
            int diarioDigitalA = diario.nextInt();
            System.out.println("Estas suscripto al diario B? (1 Si/ 2 No)");
            int diarioDigitalB = diario.nextInt();
            System.out.println("Estas suscripto al diario C? (1 Si/ 2 No)");
            int diarioDigitalC = diario.nextInt();
            if(diarioDigitalA == 1 && diarioDigitalB == 1 && diarioDigitalC == 1) {
                todos++;
            }
            if(diarioDigitalA == 1 && diarioDigitalB == 2 && diarioDigitalC == 1) {
                a_c++;
            }
            if(diarioDigitalA == 1 && diarioDigitalB == 1 && diarioDigitalC == 2) {
                a_b++;
            }
            if(diarioDigitalA == 2 && diarioDigitalB == 1 && diarioDigitalC == 1) {
                b_c++;
            }

            }
        System.out.println("La cantidad de suscriptores a todos los diarios es de: " + todos);
        System.out.println("La cantidad de suscriptores al diario A y B es de: " + a_b);
        System.out.println("La cantidad de suscriptores al diario A y C es de: " + a_c);
        System.out.println("La cantidad de suscriptores al diario B y C es de: " + b_c);
        }




    }

