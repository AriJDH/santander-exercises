package com.C13.practicaIntegradora.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EntradaBlogDto {
    private Integer id;
    private String titulo;
    private String nombre;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date fechaPublicacion;

    public EntradaBlogDto(Integer id) {
        this.id = id;
    }
}
