package com.ejerciciointegrador.Ejercicio_Integrador.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@Data
public class EntradaBlogDTO {
    private int id;
    private String nombre;
    private String autor;

    private LocalDate fecha;
}
