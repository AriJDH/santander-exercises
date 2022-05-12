package com.desafioSpring.desafio_spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class VuelosDto {

    //Se utiliza como punto medio para pasar datos de vuelos y mostrarlos en la pagina
    private String nroVuelo;
    private String origen;
    private String destino;
    private String tipoAsiento;
    private double precioPersona;
    @DateTimeFormat
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fechaIda;
    @DateTimeFormat
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fechaVuelta;

}
