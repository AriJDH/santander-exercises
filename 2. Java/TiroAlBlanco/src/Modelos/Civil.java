package Modelos;

public class Civil extends Jugador {

    double probabilidad = 0.1;

    public Civil(String nombre,int puntaje, double probabilidad) {
        super(nombre,puntaje);
        this.probabilidad = probabilidad;
    }


}
