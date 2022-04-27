package com.ejercicio.ejercicio.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Alumno {
    protected String nombre;
    protected List<Materias> materias;

}
