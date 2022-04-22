package com.bootcamp.C9P1.practica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Renault", "Clio", 100);

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo);

        Garaje garaje = new Garaje(vehiculos);
    }
}
