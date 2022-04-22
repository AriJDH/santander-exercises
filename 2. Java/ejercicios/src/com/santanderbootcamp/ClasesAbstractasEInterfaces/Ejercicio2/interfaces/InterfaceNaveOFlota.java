package com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio2.interfaces;

import com.santanderbootcamp.ClasesAbstractasEInterfaces.Ejercicio2.modelos.NaveSimple;

public interface InterfaceNaveOFlota {
    public NaveSimple masCercanaACoordenada(int x, int y);
    public double distanciaACoordenada(int x, int y);
    public int getPuntuacion();
}
