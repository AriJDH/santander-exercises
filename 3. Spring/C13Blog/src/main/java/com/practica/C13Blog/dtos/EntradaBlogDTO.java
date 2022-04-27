package com.practica.C13Blog.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
//Necesita los setters para el JSON del response
@Data
public class EntradaBlogDTO {
    private Integer id;
    private String titulo;
    private String nombre;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fecha;
}
