package com.santanderbootcamp.GenericsWrapperLambdaStreams.modelos;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Garage {
    private int id;
    private List<Vehiculo> listaVehiculos;

    public Garage(int id, List<Vehiculo> listaVehiculos) {
        this.id = id;
        this.listaVehiculos = listaVehiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public void mostrarPrecioDeMenorAMayor() {
        listaVehiculos.stream().sorted((va,vb)->va.getCosto().compareTo(vb.getCosto())).forEach(System.out::println);
    }

    public void mostrarMarcaPrecioDeMenorAMayor() {
        listaVehiculos.stream().sorted((va,vb)->va.getCosto().compareTo(vb.getCosto())).sorted((va,vb)->va.getMarca().compareTo(vb.getMarca())).forEach(System.out::println);
    }

    public List<Vehiculo> vehiculosMenoresA1000() {
        return listaVehiculos.stream().filter(vehiculo->vehiculo.getCosto() < 1000).collect(Collectors.toList());
    }

    public List<Vehiculo> vehiculosAPartirDe1000() {
        return listaVehiculos.stream().filter(vehiculo->vehiculo.getCosto() >= 1000).collect(Collectors.toList());
    }

    public Double promedioPrecios() {
        return listaVehiculos.stream().mapToDouble(vehiculo-> vehiculo.getCosto()).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "id=" + id +
                ", listaVehiculos=" + listaVehiculos +
                '}';
    }
}
