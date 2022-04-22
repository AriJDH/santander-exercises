package com.santander.ejercicio1;

import java.util.List;

public class PersonalMantenimiento extends Empleado {
    List<String> elementosMantenimiento;

    public PersonalMantenimiento(int dni, String nombre, String apellido, int edad, int nroEmplado, String area, List<String> elementosMantenimiento, String instalacion) {
        super(dni, nombre, apellido, edad, nroEmplado, area);
        this.elementosMantenimiento = elementosMantenimiento;
    }

    public List<String> getElementosMantenimiento() {
        return elementosMantenimiento;
    }

    public void setElementosMantenimiento(List<String> elementosMantenimiento) {
        this.elementosMantenimiento = elementosMantenimiento;
    }

    @Override
    public String toString() {
        return "PersonalMantenimiento{" +
                "nroEmplado=" + nroEmplado +
                ", area='" + area + '\'' +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", elementosMantenimiento=" + elementosMantenimiento +
                '}';
    }

    @Override
    public void trabajar() {
        System.out.println("Realizar mantenimiento de " + area + " con " + elementosMantenimiento);
    }


}
