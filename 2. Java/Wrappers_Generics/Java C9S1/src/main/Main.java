package main;

import clases.Garage;
import clases.Vehiculo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo>vehiculoList=new ArrayList<>();

        vehiculoList.add(new Vehiculo("Ford","Fiesta",1000));
        vehiculoList.add(new Vehiculo("Ford","Focus",1200));
        vehiculoList.add(new Vehiculo("Cord","Explorer",2500));
        vehiculoList.add(new Vehiculo("Fiat","Uno",500));
        vehiculoList.add(new Vehiculo("Fiat","Cronos",1000));
        vehiculoList.add(new Vehiculo("Fiat","Torino",1250));
        vehiculoList.add(new Vehiculo("Chevrolet","Aveo",1250));
        vehiculoList.add(new Vehiculo("Chevrolet","Spin",2500));
        vehiculoList.add(new Vehiculo("Toyota","Corolla",1200));
        vehiculoList.add(new Vehiculo("Toyota","Fortuner",3000));
        vehiculoList.add(new Vehiculo("Renault","Logan",950));


        //Ejercicio 3
        //vehiculoList.stream().sorted(Comparator.comparingDouble(Vehiculo::getCosto)).forEach(System.out::println);

        //Ejercicio 4
        //vehiculoList.stream().sorted(Comparator.comparing(Vehiculo::getCosto).thenComparing(Vehiculo::getMarca)).forEach(System.out::println);


        //Ejercicio 5

        System.out.println("Lista menor a 1000");
        vehiculoList.stream().filter((vehiculo -> vehiculo.getCosto()<1000)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Lista mayor a 1000");
        vehiculoList.stream().filter((vehiculo -> vehiculo.getCosto()>1000)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Promedio de la lista original");
        double total;
        System.out.println(vehiculoList.stream().collect(Collectors.averagingDouble(value -> value.getCosto())));




    }
}
