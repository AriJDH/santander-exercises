package com.santander.bootcamp.M4C12P1.DTO;

import com.santander.bootcamp.M4C12P1.models.Alumno;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class DiplomaDTO {
    private Alumno alumno;
    private String mensaje;
    private double promedio;
    private boolean felicitacion;

    public DiplomaDTO(Alumno alumno, String mensaje) {
        this.setAlumno(alumno);
        this.setMensaje(mensaje);
        this.setPromedio(alumno.calcularPromedio());
        this.setFelicitacion(alumno.calcularPromedio() > 9.0);
    }
}
