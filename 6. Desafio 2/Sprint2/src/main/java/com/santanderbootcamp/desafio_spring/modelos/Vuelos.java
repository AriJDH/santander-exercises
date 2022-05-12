package com.santanderbootcamp.desafio_spring.modelos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vuelos {

    //Datos utilizados por la clase de Vuelos
    private String nroVuelo;
    private String origen;
    private String destino;
    private String tipoAsiento;
    private double precioPersona;

    //Formateo de la fecha a LocalDate y con formato util para el resto del codigo
    @DateTimeFormat
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fechaIda;
    @DateTimeFormat
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fechaVuelta;


}
