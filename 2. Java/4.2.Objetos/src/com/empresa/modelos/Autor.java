package com.empresa.modelos;

import com.empresa.servicios.Scoring;

public class Autor {

    private String nombre;
    private String alias;

    public Autor() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void calcular() {
        Scoring.Calcular();
        // algo
    }

}
