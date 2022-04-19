package estructurasDinamicas;

public class Prenda {
    private String marca;
    private String modelo;

    public Prenda(String marca, String modelo){
        this.marca= marca;
        this.modelo= modelo;
    }

    @Override
    public String toString() {
        return ("Modelo " + modelo + " Marca " + marca);
    }
}