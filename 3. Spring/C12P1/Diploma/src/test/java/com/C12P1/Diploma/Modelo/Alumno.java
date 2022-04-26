package com.C12P1.Diploma.Modelo;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Alumno{
    protected String nombre;
    protected List<Materia> materias;


}
