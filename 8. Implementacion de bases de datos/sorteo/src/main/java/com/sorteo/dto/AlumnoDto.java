package com.sorteo.dto;


import com.sorteo.entity.Tema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class AlumnoDto {

    private String nombre, apellido;

    private int dni;

    private String curso;

    private Tema tema;

}
