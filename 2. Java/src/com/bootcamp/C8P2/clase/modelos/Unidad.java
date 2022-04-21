package com.bootcamp.C8P2.clase.modelos;

import com.bootcamp.C8P2.clase.interfaces.IArma;

public abstract class Unidad implements IArma {
    private final int punteria;
    private final int poder;
    private float puntaje;

    public Unidad(int punteria, int poder) {
        this.punteria = punteria;
        this.poder = poder;
        this.puntaje = 0;
    }

    @Override
    public void disparar() {
        int numero = (int) Math.floor(Math.random() * 100);
        if(numero <= punteria){
            puntaje += poder;
            //System.out.print("A");
        }
    }

    public float deducir_costos(float fondos) {
        return fondos - poder;
    }

    public float getPuntaje() {
        return puntaje;
    }
}
