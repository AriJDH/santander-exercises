package Modelos;

public class Soldado extends Jugador{

    double probabilidad = 0.5;

    public Soldado(String nombre, int puntaje, double probabilidad) {
        super(nombre,puntaje);
        this.probabilidad = probabilidad;
    }


}
