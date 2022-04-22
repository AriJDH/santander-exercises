package com.santander.ejercicio1;

public class Estudiante extends Persona {
    int numeroDeLegajo;
    String materiasQueCursa;
    String historiaAcademica;
    boolean estudiando;

    public Estudiante(int dni, String nombre, String apellido, int edad, int numeroDeLegajo, String materiasQueCursa, String historiaAcademica) {
        super(dni, nombre, apellido, edad);
        this.numeroDeLegajo = numeroDeLegajo;
        this.materiasQueCursa = materiasQueCursa;
        this.historiaAcademica = historiaAcademica;
        this.estudiando = false;
    }

    public int getNumeroDeLegajo() {
        return numeroDeLegajo;
    }

    public void setNumeroDeLegajo(int numeroDeLegajo) {
        this.numeroDeLegajo = numeroDeLegajo;
    }

    public String getMateriasQueCursa() {
        return materiasQueCursa;
    }

    public void setMateriasQueCursa(String materiasQueCursa) {
        this.materiasQueCursa = materiasQueCursa;
    }

    public String getHistoriaAcademica() {
        return historiaAcademica;
    }

    public void setHistoriaAcademica(String historiaAcademica) {
        this.historiaAcademica = historiaAcademica;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "numeroDeLegajo=" + numeroDeLegajo +
                ", materiasQueCursa='" + materiasQueCursa + '\'' +
                ", historiaAcademica='" + historiaAcademica + '\'' +
                '}';
    }

    public void estudiar(String materia) {
        estudiando = true;
        System.out.println(nombre + " " + apellido + " está estudiando " + materia);
    }

    public void dejarDeEstudiar() {
        estudiando = false;
    }
}
