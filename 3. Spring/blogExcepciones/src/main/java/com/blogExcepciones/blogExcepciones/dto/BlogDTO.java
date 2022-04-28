package com.blogExcepciones.blogExcepciones.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@Data
@AllArgsConstructor
public class BlogDTO {
    private String id,titulo,nombre;
    private int dia,mes,año;
}