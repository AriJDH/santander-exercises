package com.example.C13EjercicioPracticoBlog.dto;

import com.example.C13EjercicioPracticoBlog.modelos.Blog;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BlogDTO {
    private String id;
    private String titulo;
    private String autor;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fecha;

    public BlogDTO(Blog blog) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }
}
