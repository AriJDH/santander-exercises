package com.santander.aplicacionSorteo.dto;

import com.santander.aplicacionSorteo.entity.Temas;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDTO {
    private String nombre;
    private String apellido;
    private String curso;
    private TemasDTO temasDTO;
}
