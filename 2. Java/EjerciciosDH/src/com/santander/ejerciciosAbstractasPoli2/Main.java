package com.santander.ejerciciosAbstractasPoli2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);




        //------Jugador 1-------
        int coordAX;
        int coordAY;
        System.out.println("Usted esta jugando en una grilla donde [0 < CoordX < 100] y [0 < CoordY < 100]");
        System.out.println("Comencemos por el jugador 1");
        System.out.println("Ingrese las coordenadas de su nave:");
        System.out.println("Coordenada en X:");
        coordAX=input.nextInt();
        System.out.println("Coordenada en Y:");
        coordAY=input.nextInt();
        Nave nav1 = new Nave(coordAX,coordAY,"Nave1");


        int rep;

        System.out.println("Sigamos por el jugador 2");
        FlotaDeNaves flota = new FlotaDeNaves("Lamejor");
        System.out.println("Por cuantas naves quiere que se conforme su flota?");
        rep=input.nextInt();
        for (int i = 0; i < rep; i++) {
            int coordBX;
            int coordBY;
            System.out.println("Coordenada en X:");
            coordBX=input.nextInt();
            System.out.println("Coordenada en Y:");
            coordBY=input.nextInt();
            flota.cargarNave(new Nave(coordBX,coordBY,"nave2"));

        }
        int coordCX=(int)Math.floor(Math.random()*100);
        int coordCY=(int)Math.floor(Math.random()*100);

        System.out.println(nav1.calcularDistancia(3,5));
    }
}
