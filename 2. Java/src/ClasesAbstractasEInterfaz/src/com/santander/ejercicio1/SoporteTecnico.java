package com.santander.ejercicio1;

public class SoporteTecnico extends Empleado implements Tecnico {
    String especialidad;
    boolean disponible;

    public SoporteTecnico(int dni, String nombre, String apellido, int edad, int nroEmplado, String area, String especialidad) {
        super(dni, nombre, apellido, edad, nroEmplado, area);
        this.especialidad = especialidad;
        this.disponible = true;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "SoporteTecnico{" +
                "nroEmplado=" + nroEmplado +
                ", area='" + area + '\'' +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

    @Override
    public void trabajar() {
        disponible = false;
    }

    public void dejarDeTrabajar() {
        disponible = true;
    }

    @Override
    public void brindarSoporte(Persona persona) {
        System.out.println(nombre + " " + apellido + " le brinda soporte a " + persona.getNombre());
    }
}
