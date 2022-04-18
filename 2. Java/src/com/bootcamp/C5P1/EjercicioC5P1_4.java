package com.bootcamp.C5P1;

import java.util.Scanner;

public class EjercicioC5P1_4 {
    private final int CANTIDAD_ENCUESTADOS = 5;

    public void ejecutar() {
        Scanner teclado = new Scanner(System.in);
        String entrada = "";
        int suscriptos_en_A_B_C = 0, suscriptos_en_A_C = 0, suscriptos_en_A_B = 0, suscriptos_en_B_C = 0, suscriptos_solo_en_A = 0;

        for (int i = 0; i < CANTIDAD_ENCUESTADOS; i++) {
            System.out.print("Ingrese a que diarios esta suscripto el usuario Nro " + i + " (ejemplo: ABC para indicar que esta suscripto a los 3) : ");
            entrada = teclado.next();

            boolean suscripto_en_A = false, suscripto_en_B = false, suscripto_en_C = false;
            suscripto_en_A = entrada.toLowerCase().contains("a");
            suscripto_en_B = entrada.toLowerCase().contains("b");
            suscripto_en_C = entrada.toLowerCase().contains("c");

            if (suscripto_en_A && suscripto_en_B && suscripto_en_C){
                suscriptos_en_A_B_C++;
            }
            if(suscripto_en_A && suscripto_en_C){
                suscriptos_en_A_C++;
            }
            if(suscripto_en_A && suscripto_en_B){
                suscriptos_en_A_B++;
            }
            if(suscripto_en_B && suscripto_en_C){
                suscriptos_en_B_C++;
            }
            if(suscripto_en_A && !suscripto_en_B && !suscripto_en_C){
                suscriptos_solo_en_A++;
            }

        }

        System.out.println("Cuántos están suscriptos a los 3 diarios: " + suscriptos_en_A_B_C);
        System.out.println("¿Cuántos están suscriptos al Diario A y al Diario C?: " + suscriptos_en_A_C);
        System.out.println("¿Cuántos están suscriptos al Diario A y al Diario B?: " + suscriptos_en_A_B);
        System.out.println("¿Cuántos están suscriptos al Diario B y al Diario C?: " + suscriptos_en_B_C);
        System.out.println("¿Cuántos están suscriptos sólo al Diario A?: " + suscriptos_solo_en_A);
    }
}
