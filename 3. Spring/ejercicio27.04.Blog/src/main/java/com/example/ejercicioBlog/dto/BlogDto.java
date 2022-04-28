package com.example.ejercicioBlog.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogDto {

    private Integer id;
    private String titulo, nombreAutor;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fechaPublicacion;

    public BlogDto(Integer id) {
    }


    public void addElemento(BlogDto blogDto) {
    }
}
