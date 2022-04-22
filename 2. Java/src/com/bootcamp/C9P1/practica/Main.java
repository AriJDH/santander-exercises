package com.bootcamp.C9P1.practica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Renault", "Clio", 100);

        Vehiculo vehiculo1 = new Vehiculo("Ford", "Fiesta", 1000);
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Focus", 1200);
        Vehiculo vehiculo3 = new Vehiculo("Ford", "Explorer", 2500);
        Vehiculo vehiculo4 = new Vehiculo("Fiat", "Uno", 500);
        Vehiculo vehiculo5 = new Vehiculo("Fiat", "Cronos", 1000);
        Vehiculo vehiculo6 = new Vehiculo("Fiat", "Torino", 1250);
        Vehiculo vehiculo7 = new Vehiculo("Chevrolet", "Aveo", 1000);
        Vehiculo vehiculo8 = new Vehiculo("Chevrolet", "Spin", 1000);
        Vehiculo vehiculo9 = new Vehiculo("Toyota", "Corolla", 1000);
        Vehiculo vehiculo10 = new Vehiculo("Toyota", "Fortuner", 1000);
        Vehiculo vehiculo11 = new Vehiculo("Renault", "Logan", 1000);

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);
        vehiculos.add(vehiculo4);
        vehiculos.add(vehiculo5);
        vehiculos.add(vehiculo6);
        vehiculos.add(vehiculo7);
        vehiculos.add(vehiculo8);
        vehiculos.add(vehiculo9);
        vehiculos.add(vehiculo10);
        vehiculos.add(vehiculo11);

        Garaje garaje = new Garaje(vehiculos);

    }
}
