package com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio2.modelos;

import com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio2.interfaces.InterfaceNaveOFlota;

public class Participante {
    final private InterfaceNaveOFlota naveOFlota;

    public Participante(InterfaceNaveOFlota naveOFlota) {
        this.naveOFlota = naveOFlota;
    }

    public double distanciaACoordenadaDeNave(int x, int y) {
        return naveOFlota.distanciaACoordenada(x, y);
    }

    public void sumarPunto(int x, int y) {
        naveOFlota.masCercanaACoordenada(x, y).sumarPunto();
    }

    public InterfaceNaveOFlota getNaveOFlota() {
        return naveOFlota;
    }

    public int getPuntuacion() {
        return naveOFlota.getPuntuacion();
    }

    @Override
    public String toString() {
        return "Participante{" + naveOFlota + '}';
    }
}
