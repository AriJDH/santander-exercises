package com.santanderbootcamp.desafio_spring.modelos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Hoteles {

    //Datos utilizados por la clase de Hoteles
    private String codigoHotel;
    private String nombre;
    private String lugarOCiudad;
    private String habitacionTipo;
    private double precioNoche;
    //formateo de las fechas para que sean LocalDate y tengan el formato que necesitamos para el codigo
    @DateTimeFormat
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate disponibleDesde;
    @DateTimeFormat
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate disponibleHasta;
    private String reservado;



}
