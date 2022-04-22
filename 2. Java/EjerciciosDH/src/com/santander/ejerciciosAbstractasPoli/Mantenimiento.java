package com.santander.ejerciciosAbstractasPoli;

public class Mantenimiento extends Personal{
    private String especialidad;

    public Mantenimiento(String dni, String nombre, int legajo, String especialidad) {
        super(dni, nombre, legajo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
