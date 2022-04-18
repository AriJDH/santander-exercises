package com.santander.bootcamp;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int respuesta;
        int votos_opciones[] = new int [5];

        for (int i = 0; i < 10; i++){

            System.out.printf("\nEncuestado #%01d\n ¿A que diarios esta suscripto?\n 1. a los 3 diarios\n 2. Diario A y al Diario C.\n 3. Diario A y al Diario B.\n 4. Diario B y al Diario C.\n 5. solo al Diario A.\nRespuesta: ", i+1);

            respuesta = scanner.nextInt();
            if(respuesta >= 1 && respuesta <= 5)
            votos_opciones[respuesta-1]++;
        }

        System.out.printf(" Suscriptos a los 3 diarios: %01d.\n Suscriptos al A y C: %01d.\n Suscriptos al A y al B: %01d.\n Suscriptos al B y al C: %01d.\n Suscriptos sólo al A: %01d.\n", votos_opciones[0], votos_opciones[1], votos_opciones[2], votos_opciones[3], votos_opciones[4]);
    }
}
