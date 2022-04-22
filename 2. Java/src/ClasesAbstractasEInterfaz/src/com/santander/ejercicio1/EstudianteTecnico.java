package com.santander.ejercicio1;

public class EstudianteTecnico extends Estudiante implements Tecnico {
    public EstudianteTecnico(int dni, String nombre, String apellido, int edad, int numeroDeLegajo, String materiasQueCursa, String historiaAcademica) {
        super(dni, nombre, apellido, edad, numeroDeLegajo, materiasQueCursa, historiaAcademica);
    }

    @Override
    public String toString() {
        return "EstudianteTecnico{" +
                "numeroDeLegajo=" + numeroDeLegajo +
                ", materiasQueCursa='" + materiasQueCursa + '\'' +
                ", historiaAcademica='" + historiaAcademica + '\'' +
                ", estudiando=" + estudiando +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }


    @Override
    public void brindarSoporte(Persona persona) {
        System.out.println(nombre + " " + apellido + " está brindando soporte a " + persona);
    }
}
