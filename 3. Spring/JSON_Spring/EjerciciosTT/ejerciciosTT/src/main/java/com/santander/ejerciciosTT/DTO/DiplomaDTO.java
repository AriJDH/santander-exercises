package com.santander.ejerciciosTT.DTO;

public class DiplomaDTO {
    private double promedio;
    private String nombreAlumno;
    private String mensaje;

    public DiplomaDTO(double promedio, String nombre) {
        this.promedio = promedio;
        nombreAlumno = nombre;
        mensaje = nombreAlumno + " se graduó con un promedio de " + promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
