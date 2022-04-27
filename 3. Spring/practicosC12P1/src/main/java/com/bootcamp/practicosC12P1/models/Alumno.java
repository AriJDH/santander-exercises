package com.bootcamp.practicosC12P1.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Alumno {
    String nombreAlumno;
    List<Materia> materias;
}
