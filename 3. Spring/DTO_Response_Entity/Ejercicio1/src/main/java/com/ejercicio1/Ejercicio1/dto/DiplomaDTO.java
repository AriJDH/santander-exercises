package com.ejercicio1.Ejercicio1.dto;

public class DiplomaDTO {
    private String mensaje;
    private double promedio;
    private String alumno;

    public DiplomaDTO(double promedio, String alumno) {
        this.mensaje = "El alumno "+ alumno+ " se a graduado con un promedio de "+promedio;
        this.promedio = promedio;
        this.alumno = alumno;
    }
    public String mostrarMensaje(){
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getMensaje() {
        return mensaje;
    }
}
