package com.santander.ejerciciosAbstractasPoli;

public class Tutores extends Estudiante {
    private Estudiante estudiante;

    public Tutores(String dni, String nombre, int curso, Estudiante estudiante) {
        super(dni, nombre, curso);
        this.estudiante = estudiante;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
