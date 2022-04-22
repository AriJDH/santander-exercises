package com.santander.ejercicio1;

import java.util.List;

public class Tutor extends Estudiante implements Pedagogo{
    boolean ocupado;

    public Tutor(int dni, String nombre, String apellido, int edad, int numeroDeLegajo, String materiasQueCursa, String historiaAcademica, boolean ocupado) {
        super(dni, nombre, apellido, edad, numeroDeLegajo, materiasQueCursa, historiaAcademica);
        this.ocupado = false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "numeroDeLegajo=" + numeroDeLegajo +
                ", materiasQueCursa='" + materiasQueCursa + '\'' +
                ", historiaAcademica='" + historiaAcademica + '\'' +
                ", estudiando=" + estudiando +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", ocupado=" + ocupado +
                '}';
    }


    @Override
    public void enseñar(String tema, List<Persona> personas) {
        ocupado = true;
        System.out.println(nombre + " " + apellido + " está enseñando " + tema + " a " + personas);
    }

    public void dejarDeEnseñar() {
        ocupado = false;
    }
}
