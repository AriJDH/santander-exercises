package com.santander.bootcamp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> listaVehiculos = new ArrayList<>(11);

        listaVehiculos.add(new Vehiculo("Ford", "Fiesta", 1000));
        listaVehiculos.add(new Vehiculo("Ford", "Focus", 1200));
        listaVehiculos.add(new Vehiculo("Ford", "Explorer", 2500));
        listaVehiculos.add(new Vehiculo("Fiat", "Uno", 500));
        listaVehiculos.add(new Vehiculo("Fiat", "Cronos", 1000));
        listaVehiculos.add(new Vehiculo("Fiat", "Torino", 1250));
        listaVehiculos.add(new Vehiculo("Chevrolet", "Aveo", 1250));
        listaVehiculos.add(new Vehiculo("Chevrolet", "Spin", 2500));
        listaVehiculos.add(new Vehiculo("Toyota", "Corolla", 1200));
        listaVehiculos.add(new Vehiculo("Toyota", "Fortuner", 3000));
        listaVehiculos.add(new Vehiculo("Renault", "Logan", 950));

        Garaje garaje = new Garaje(1, listaVehiculos);

        listaVehiculos.sort((a, b) -> a.getCosto() >= b.getCosto() ? 1 : -1);
        listaVehiculos.sort((a, b) -> a.getMarca().compareToIgnoreCase(b.getMarca()));

        System.out.printf("%nVehiculos ordenados por marca y costo%n");
        listaVehiculos.forEach(System.out::println);

        System.out.printf("%n--------------------------------------------------%n");

        System.out.printf("%nVehiculos cuyo costo es menor a 1000%n");
        (listaVehiculos.stream().filter((vehiculo -> vehiculo.getCosto() < 1000)).collect(Collectors.toList())).forEach(System.out::println);

        System.out.printf("%n--------------------------------------------------%n");

        System.out.printf("%nVehiculos cuyo costo es mayor a 1000%n");
        (listaVehiculos.stream().filter((vehiculo -> vehiculo.getCosto() >= 1000)).collect(Collectors.toList())).forEach(System.out::println);

        System.out.printf("%n--------------------------------------------------%n");

        System.out.printf("%nCosto promedio de los vehículos: $%.2f%n", listaVehiculos.stream().mapToDouble((vehiculo -> vehiculo.getCosto())).average().getAsDouble());
    }


}
