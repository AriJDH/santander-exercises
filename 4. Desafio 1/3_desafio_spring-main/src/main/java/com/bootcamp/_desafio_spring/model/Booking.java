package com.bootcamp._desafio_spring.model;

import com.bootcamp._desafio_spring.dto.MetodoPagoDto;
import com.bootcamp._desafio_spring.dto.PersonaDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Booking {
    private String codigoHotel;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate desde;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate hasta;
    private List<PersonaDto> personas;
    private MetodoPagoDto metodoPago;
    private Integer id;

    public boolean periodoNoSeSolapa(LocalDate entrada, LocalDate salida){
        return ((!calcularDiferencia(entrada,this.desde).isNegative()   //10/01   -   12/01   = 2
                &&!calcularDiferencia(salida,this.desde).isNegative())  // 15/01 -   12/01  = -3
                ||(!calcularDiferencia(this.hasta,entrada).isNegative()   // 18/01   -  10/01 = -8
                && calcularDiferencia(salida,this.hasta).isNegative()));  //18/01   -  15/01 = -3
    }

    private Period calcularDiferencia(LocalDate desde, LocalDate hasta){
        Period periodo = Period.between(desde, hasta);
        return periodo;

    }

    public double getDiasDiferencia() {
        return ChronoUnit.DAYS.between(this.desde, this.hasta);
    }

}
