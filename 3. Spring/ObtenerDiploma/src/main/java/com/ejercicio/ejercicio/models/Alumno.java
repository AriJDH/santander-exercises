package com.ejercicio.ejercicio.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Alumno {
    protected String nombre;
    protected List<Materias> materias;

}
