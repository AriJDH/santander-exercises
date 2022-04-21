package com.bootcamp.C8P2.clase;

import com.bootcamp.C8P2.clase.modelos.*;

public class Main {
    public static void main(String[] args) {
        int numero = (int) Math.floor(Math.random() * 10);

        //simulador de tiro al blanco
        //objetos, herencia, polimorfismo, abstractas, interfaces

        //soldado, tanque
        //cantidad de acieros por diez disparos
        // metodo puntaje segun aciertos

        //excepciones

        /*Unidad soldado = new Soldado();
        Tanque tanquecito = new Tanque();
        Helicoptero choppa = new Helicoptero();
        for (int i = 0; i < 10; i++) {
            //soldado.disparar();
            //tanquecito.disparar();
            choppa.disparar();
        }*/


        float fondos = 5000;
        Equipo equipo_azul = new Equipo(fondos, "azul");
        Equipo equipo_rojo = new Equipo(fondos, "rojo");

        equipo_azul.comprar("soldado");
        equipo_azul.comprar("tanque");
        equipo_azul.comprar("helicoptero");

        //Tira excepcion
        //equipo_azul.comprar("asdasdasd");

        equipo_rojo.comprar("soldado");
        equipo_rojo.comprar("soldado");
        equipo_rojo.comprar("soldado");
        equipo_rojo.comprar("tanque");


        //empieza juego, disparan 10 veces todos
        int hasta = 3;
        System.out.println("Empieza el juego disparan: " + hasta + " veces");
        for (int i = 0; i < hasta; i++) {
            equipo_azul.disparar_todos();
            equipo_rojo.disparar_todos();
        }

        System.out.println("");
        equipo_azul.mostrar_puntaje();
        equipo_rojo.mostrar_puntaje();
    }
}
