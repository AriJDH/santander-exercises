package com.santanderbootcamp.GenericsWrapperLambdaStreams;

import com.santanderbootcamp.GenericsWrapperLambdaStreams.modelos.Garage;
import com.santanderbootcamp.GenericsWrapperLambdaStreams.modelos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Vehiculo crearVehiculo(String marca, String modelo, double precio) {
        return new Vehiculo(marca,modelo,precio);
    }

    public static void main(String[] args) {
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(crearVehiculo("Ford", "Fiesta", 1000.0));
        listaVehiculos.add(crearVehiculo("Ford", "Focus", 1200.0));
        listaVehiculos.add(crearVehiculo("Ford", "Explorer", 2500.0));
        listaVehiculos.add(crearVehiculo("Fiat", "Uno", 500.0));
        listaVehiculos.add(crearVehiculo("Fiat", "Cronos", 1000.0));
        listaVehiculos.add(crearVehiculo("Fiat", "Torino", 1250.0));
        listaVehiculos.add(crearVehiculo("Chevrolet", "Aveo", 1250.0));
        listaVehiculos.add(crearVehiculo("Chevrolet", "Spin", 2500.0));
        listaVehiculos.add(crearVehiculo("Toyota", "Corolla", 1200.0));
        listaVehiculos.add(crearVehiculo("Toyota", "Fortuner", 3000.0));
        listaVehiculos.add(crearVehiculo("Renault", "Logan", 950.0));
        Garage garage = new Garage(0, listaVehiculos);
        garage.mostrarPrecioDeMenorAMayor();

    }
}
