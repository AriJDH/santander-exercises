package com.santanderbootcamp.C8P2.Ejercicio1.modelos;

public class Curso {
    private String nombre;
    private String comision;
    private Profesor profesor;

    public Curso(String nombre, String comision, Profesor profesor) {
        this.nombre = nombre;
        this.comision = comision;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", comision='" + comision + '\'' +
                ", profesor=" + profesor +
                '}';
    }
}
