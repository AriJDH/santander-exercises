package com.santanderbootcamp.Blog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntradaBlog {
    private int id;
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;
}
