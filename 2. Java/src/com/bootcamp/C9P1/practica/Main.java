package com.bootcamp.C9P1.practica;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Ford", "Fiesta", 1000);
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Focus", 1200);
        Vehiculo vehiculo3 = new Vehiculo("Ford", "Explorer", 2500);
        Vehiculo vehiculo4 = new Vehiculo("Fiat", "Uno", 500);
        Vehiculo vehiculo5 = new Vehiculo("Fiat", "Cronos", 1000);
        Vehiculo vehiculo6 = new Vehiculo("Fiat", "Torino", 1250);
        Vehiculo vehiculo7 = new Vehiculo("Chevrolet", "Aveo", 1250);
        Vehiculo vehiculo8 = new Vehiculo("Chevrolet", "Spin", 2500);
        Vehiculo vehiculo9 = new Vehiculo("Toyota", "Corolla", 1200);
        Vehiculo vehiculo10 = new Vehiculo("Toyota", "Fortuner", 3000);
        Vehiculo vehiculo11 = new Vehiculo("Renault", "Logan", 950);

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

        System.out.println("\t Ordenar por Costo AScendente");
        garaje.ordenarPorCostoAscendente();

        System.out.println("\t Ordenar por Costo y Marca Ascendente");
        garaje.ordenarPorMarcaCostoAscendente();

        System.out.println("\t Vehiculos menor a 1000");
        List<Vehiculo> menores_a_1000 = garaje.getVehiculosMenorA(1000);
        System.out.println(menores_a_1000);

        System.out.println("\t Vehiculos mayor o igual a 1000");
        List<Vehiculo> mayores_igual_a_1000 = garaje.getVehiculosMayorIgualA(1000);
        System.out.println(mayores_igual_a_1000);

        System.out.println("\t Promedio todos los vehiculos");
        double promedio = garaje.getPromedioCostoVehiculos();
        System.out.println("Promedio: " + promedio);
    }
}
