package com.Ejercicio2;

public class Tarifa {
    private int idCarrera;
    private String nombreCarrera;
    private int menores;
    private int mayores;

    public Tarifa(int idCarrera, String nombreCarrera, int menores, int mayores){
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
        this.menores = menores;
        this.mayores = mayores;

    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public int getMayores() {
        return mayores;
    }

    public int getMenores() {
        return menores;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public void setMayores(int mayores) {
        this.mayores = mayores;
    }

    public void setMenores(int menores) {
        this.menores = menores;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    @Override
    public String toString() {
        return "Tarifa{" +
                "idCarrera=" + idCarrera +
                ", nombreCarrera='" + nombreCarrera + '\'' +
                ", menores=" + menores +
                ", mayores=" + mayores +
                '}';
    }
}
