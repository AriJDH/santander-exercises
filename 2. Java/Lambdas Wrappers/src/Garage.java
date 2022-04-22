import java.util.ArrayList;

public class Garage {
    private int id;
    private ArrayList<Vehiculo> vehiculo= new ArrayList<>();

    public Garage(int id, ArrayList<Vehiculo> vehiculo) {
        this.id = id;
        this.vehiculo = vehiculo;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public setVehiculos(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }
}
