package com.practica.C13Blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class EntradaBlog {
    Integer id;
    String titulo;
    String nombre_autor;
    LocalDate fecha_publicacion;
}
