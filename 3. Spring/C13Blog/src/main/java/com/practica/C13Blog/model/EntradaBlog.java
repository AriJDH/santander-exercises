package com.practica.C13Blog.model;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class EntradaBlog {
    Integer id;
    String titulo;
    String nombre_autor;
    LocalDate fecha_publicacion;
}
