package com.santander.aplicacionSorteo.dto;

import com.santander.aplicacionSorteo.entity.Alumnos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemasDTO {

    private Integer id;

    private String nombreTema;

    private String complejidad;

}
