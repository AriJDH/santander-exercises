package com.santander.ejerciciosAbstractasPoli;

public class Tecnicos extends Estudiante{
    private String especializacion;

    public Tecnicos(String dni, String nombre, int curso, String especializacion) {
        super(dni, nombre, curso);
        this.especializacion = especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}
