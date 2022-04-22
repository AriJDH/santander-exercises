package com.bootcamp.C9P1.practica;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Garaje {
    List<Vehiculo> vehiculos;
    public Garaje(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }


    public List<Vehiculo> getVehiculosOrdenadosPrecioAscendente() {
        return vehiculos.stream().sorted((x,y)->Double.compare(x.getCosto(), y.getCosto())).collect(Collectors.toList());
    }

    public void ordenarPorCostoAscendente(){
        vehiculos.sort((a,b)-> a.getCosto() >= b.getCosto() ? 1 : -1);
        vehiculos.forEach(System.out::println);
    }

    public void ordenarPorMarcaCostoAscendente(){
        vehiculos.sort((a,b)-> a.getCosto() >= b.getCosto() ? 1 : -1);
        vehiculos.sort((a,b)-> a.getMarca().compareToIgnoreCase(b.getMarca()));
        vehiculos.forEach(System.out::println);
    }

    /*
    public OptionalDouble getPromedioCosto(){
        return vehiculos.stream().mapToDouble(Vehiculo::getCosto).average().getAsDouble();
    }*/
}
