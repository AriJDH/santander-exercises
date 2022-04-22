package com.santander.ejerciciosAbstractasPoli;

public class Estudiante extends Persona{
    private int curso;

    public Estudiante(String dni, String nombre, int curso) {
        super(dni, nombre);
        this.curso = curso;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void estudiar(){
        System.out.println("Hola estoy estudiando");
    }
}
