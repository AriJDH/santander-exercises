package com.ejPOSTyResponse.ejPOSTyResponse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDTO {
    private String nombre;
    private ArrayList<MateriaDTO> materias;
}
