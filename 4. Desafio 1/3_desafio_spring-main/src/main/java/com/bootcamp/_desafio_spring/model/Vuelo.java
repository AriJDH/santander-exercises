package com.bootcamp._desafio_spring.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Vuelo {
    private String nroVuelo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fechaIda;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fechaVuelta;
    private double precioPersona;
    private String origen;
    private String destino;
    private String tipoAsiento;


    public boolean reservar(LocalDate desde,LocalDate hasta){
        return desde.equals(fechaIda) && hasta.equals(fechaVuelta);
    }


}
