package ej;

import java.util.ArrayList;

public class Garage {
    private String id;
    private ArrayList<Vehiculo> vehiculos;

    public Garage(String id, ArrayList<Vehiculo> vehiculos) {
        this.id = id;
        this.vehiculos = vehiculos;
    }

    public String getId() {
        return id;
    }
    public void addVehiculo (Vehiculo v1){
        vehiculos.add(v1);
    }
    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
