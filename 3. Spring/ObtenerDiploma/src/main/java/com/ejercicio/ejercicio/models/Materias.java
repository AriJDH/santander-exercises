package com.ejercicio.ejercicio.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class Materias {
    protected String nombre;
    protected int nota;

    public Materias(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
}
