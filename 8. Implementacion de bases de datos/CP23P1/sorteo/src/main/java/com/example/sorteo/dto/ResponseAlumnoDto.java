package com.example.sorteo.dto;

import com.example.sorteo.entity.Tema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseAlumnoDto {

    private int id;

    private String nombre;

    private String apellido;

    private int dni;

    private String curso;

    private ResponseTemaDto tema;
}
