package p1.models;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private int id;
    List<Vehiculo> vehiculos;

    public Garage() {
    }

    public Garage(int id) {
        this.id = id;
        vehiculos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
