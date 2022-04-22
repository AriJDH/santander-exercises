package com.santander.bootcamp.ejercicio2;

public class Nave {
    protected Coordenadas ubicacion;

    public Nave(Coordenadas ubicacion) {
        this.setUbicacion(ubicacion);
    }

    public Coordenadas getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(Coordenadas ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String mostrarUbicacion() {
        return "( " + this.getUbicacion().getX() + ", " + this.getUbicacion().getY() + ")";
    }
}
