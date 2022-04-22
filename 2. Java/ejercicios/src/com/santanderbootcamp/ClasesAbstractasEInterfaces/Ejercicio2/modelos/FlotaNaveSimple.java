package com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio2.modelos;

import com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio2.interfaces.InterfaceNaveOFlota;

import java.util.ArrayList;
import java.util.List;

public class FlotaNaveSimple implements InterfaceNaveOFlota {
    private List<NaveSimple> flota = new ArrayList<>();

    public FlotaNaveSimple(List<NaveSimple> flota) {
        this.flota = flota;
    }

    public int getPuntuacion() {
        int puntos = 0;
        for(NaveSimple nave: flota) {
            puntos += nave.getPuntuacion();
        }
        return puntos;
    }

    @Override
    public NaveSimple masCercanaACoordenada(int x, int y) {
        int x1 = flota.get(0).getCoordX(), y1 = flota.get(0).getCoordY();
        int x2 = flota.get(0).getCoordX(), y2 = flota.get(0).getCoordY();
        NaveSimple nave = flota.get(0);
        for(int i = 1; i < flota.size(); i++) {
            x2 = flota.get(i).getCoordX();
            y2 = flota.get(i).getCoordY();
            if(NaveSimple.calcularDistancia(x,x1,y,y1) > NaveSimple.calcularDistancia(x,x2,y,y2)) {
                x1 = flota.get(i).getCoordX();
                y1 = flota.get(i).getCoordY();
                nave = flota.get(i);
            }
        }
        return nave;
    }

    @Override
    public double distanciaACoordenada(int x, int y) {
        int x2 = flota.get(0).getCoordX(), y2 = flota.get(0).getCoordY();
        for(int i = 1; i < flota.size(); i++) {
            x2 += flota.get(i).getCoordX();
            y2 += flota.get(i).getCoordY();
        }
        return NaveSimple.calcularDistancia(x, x2 / flota.size(), y, y2 / flota.size());
    }

    private String flotaToString() {
        String strFlota = "{";
        for(NaveSimple nave: flota) {
            strFlota += "\n\t" + nave;
        }
        return strFlota + "\n}";
    }

    @Override
    public String toString() {
        return "FlotaNaveSimple" + flotaToString() + " -----> Puntuación Total " + getPuntuacion();
    }
}
