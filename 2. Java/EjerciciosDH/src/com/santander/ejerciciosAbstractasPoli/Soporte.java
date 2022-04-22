package com.santander.ejerciciosAbstractasPoli;

public class Soporte extends Tecnicos{
    private String horario;

    public Soporte(String dni, String nombre, int curso, String especializacion, String horario) {
        super(dni, nombre, curso, especializacion);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
