package com.santander.C12P1EjercicioPractico.dto;

public class DiplomaDTO extends AlumnoDTO{
    private String mensaje;
    private AlumnoDTO alumno; //es necesario usarlo si ya lo extiendo a alumnoDTO?
    private double promedio;

    public DiplomaDTO() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public AlumnoDTO getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoDTO alumno) {
        this.alumno = alumno;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
