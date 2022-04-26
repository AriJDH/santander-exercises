package com.ejPOSTyResponse.ejPOSTyResponse.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
    private String nombre;
    private ArrayList<Materia> materias;
}
