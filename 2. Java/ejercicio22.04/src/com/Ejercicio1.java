package com;

import java.util.ArrayList;
import java.util.Comparator;


public class Ejercicio1 {
    public static void main(String[] args) {


        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Vehiculo("Ford","Fiesta", 1000));
        vehiculos.add(new Vehiculo("Ford","Focus", 1200));
        vehiculos.add(new Vehiculo("Ford","Explorer", 2500));
        vehiculos.add(new Vehiculo("Fiat","Uno", 500));
        vehiculos.add(new Vehiculo("Fiat","Cronos", 1000));
        vehiculos.add(new Vehiculo("Fiat","Torino", 1250));
        vehiculos.add(new Vehiculo("Chevrolet","Aveo", 1250));
        vehiculos.add(new Vehiculo("Chevrolet","Spin", 2500));
        vehiculos.add(new Vehiculo("Toyota","Corolla", 1200));
        vehiculos.add(new Vehiculo("Toyota","Fortuner", 3000));
        vehiculos.add(new Vehiculo("Renaut","Logan", 950));

        Garaje garaje = new Garaje(1, vehiculos);

        vehiculos.stream()
                .sorted((x,y) -> x.getCosto().compareTo(y.getCosto()))
                .forEach(System.out::println);

        System.out.println("*****");

        Comparator<Vehiculo> byMarca = Comparator.comparing(Vehiculo::getMarca);
        Comparator<Vehiculo> byCosto = Comparator.comparing(Vehiculo::getCosto);
        garaje.getVehiculos().sort(byMarca.thenComparing(byCosto));
        System.out.println(garaje);
        System.out.println("*****");
        vehiculos.stream().filter((vehiculo) -> vehiculo.getCosto() < 1000).forEach(System.out::println);
        System.out.println("*****");
        vehiculos.stream().filter((vehiculo) -> vehiculo.getCosto() >= 1000).forEach(System.out::println);
        System.out.println("*****");



    }
}
