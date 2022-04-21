package Modelos;

public class Tanque extends Jugador {

    double probabilidad = 0.8;

    public Tanque(String nombre, int puntaje, double probabilidad) {
        super(nombre,puntaje);
        this.probabilidad = probabilidad;
    }
}
