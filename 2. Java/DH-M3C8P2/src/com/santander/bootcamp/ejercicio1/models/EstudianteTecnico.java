package com.santander.bootcamp.ejercicio1.models;

public class EstudianteTecnico extends Estudiante implements SoporteTecnico {
    public EstudianteTecnico(String nombre, String apellido, String dni, String libreta) {
        super(nombre, apellido, dni, libreta);
    }

    @Override
    public void asistir() {
        System.out.println("El estudiante tecnico asistio a clases");
    }

    @Override
    public void arreglar() {
        System.out.println("El estudiante tecnico arreglo algo");
    }
}
