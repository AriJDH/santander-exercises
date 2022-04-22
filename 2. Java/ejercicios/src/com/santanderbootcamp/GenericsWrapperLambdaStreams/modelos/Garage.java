package com.santanderbootcamp.GenericsWrapperLambdaStreams.modelos;

import java.util.List;

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

    @Override
    public String toString() {
        return "Garage{" +
                "id=" + id +
                ", listaVehiculos=" + listaVehiculos +
                '}';
    }
}
