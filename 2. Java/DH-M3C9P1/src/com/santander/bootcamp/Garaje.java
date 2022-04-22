package com.santander.bootcamp;

import java.util.List;

public class Garaje {
    int id;
    List<Vehiculo> listaVehiculo;

    public Garaje(int id, List<Vehiculo> listaVehiculo) {
        this.setId(id);
        this.setListaVehiculo(listaVehiculo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Vehiculo> getListaVehiculo() {
        return listaVehiculo;
    }

    public void setListaVehiculo(List<Vehiculo> listaVehiculo) {
        this.listaVehiculo = listaVehiculo;
    }
}
