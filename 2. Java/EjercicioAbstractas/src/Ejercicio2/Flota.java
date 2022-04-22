package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Flota implements Distancias{
    List<Nave> flota = new ArrayList<>();

    public Flota(List<Nave> flota) {
        this.flota = flota;
    }

    public List<Nave> getFlota() {
        return flota;
    }

    public void setFlota(List<Nave> flota) {
        this.flota = flota;
    }

    @Override
    public double Distancia(List<Double> coordenadas) {
        double Promedio = 0;
        for (int i = 0; i< flota.size();i++){
            Promedio+= Math.pow((Math.pow(flota.get(i).x-coordenadas.x,2)+Math.pow(flota.get(i).y-coordenadas.y, 2)),0.5f);
        }
        return Promedio/flota.size();
    }
}
