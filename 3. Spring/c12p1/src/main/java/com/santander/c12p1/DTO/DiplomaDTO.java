package com.santander.c12p1.DTO;

import com.santander.c12p1.models.Alumno;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;


@Data
@AllArgsConstructor
public class DiplomaDTO {

    private String alumno;
    private double promedio;
    private String mensaje;
    private Boolean felicitacion;

}
