package com.resolucion;

import java.util.Scanner;

public class MainSinVectorFijo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int cantidadCiudades;
        System.out.println("Introduzca la cantidad de ciudades a ingresar");
        cantidadCiudades=scanner.nextInt();

        String ciudades[]= new String[cantidadCiudades];
        double temperaturas[][]= new double[cantidadCiudades][2];
        for (int i = 0; i < cantidadCiudades; i++) {
            System.out.println("Introduzca el nombre de la ciudad");
            ciudades[i]=scanner.next();
            System.out.println("Introduzca temperatura minima");
            temperaturas[i][0]= scanner.nextInt();
            System.out.println("Introduzca temperatura maxima");
            temperaturas[i][1]= scanner.nextInt();
        }
        double temperaturaMaxima = temperaturas[0][1], temperaturaMinima = temperaturas[0][0];
        String ciudadTemperaturaMinima = ciudades[0], ciudadTemperaturaMaxima = ciudades[0];
        for (int i = 0; i < cantidadCiudades; i++) {
            if(temperaturas[i][0]< temperaturaMinima){
                temperaturaMinima=temperaturas[i][0];
                ciudadTemperaturaMinima=ciudades[i];
            }
            if(temperaturas[i][1]> temperaturaMaxima){
                temperaturaMaxima=temperaturas[i][1];
                ciudadTemperaturaMaxima=ciudades[i];
            }

        }
        System.out.println("La ciudad de "+ciudadTemperaturaMinima+" fue la ciudad mas fria con temperaturas minimas de "+temperaturaMinima);
        System.out.println("La ciudad de "+ciudadTemperaturaMaxima+" fue la ciudad mas calurosa con temperaturas maximas de "+temperaturaMaxima);
    }
}
