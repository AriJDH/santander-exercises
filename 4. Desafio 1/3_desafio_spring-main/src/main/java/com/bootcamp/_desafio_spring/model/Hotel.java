package com.bootcamp._desafio_spring.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    private String codigoHotel;
    private String nombre;
    private String lugarOCiudad;
    private String habitacionTipo;
    private double precioNoche;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate disponibleDesde;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate disponibleHasta;
    private String reservado;

    public boolean estaDisponible(LocalDate fechaDesde, LocalDate fechaHasta){
        ChronoUnit dias = ChronoUnit.DAYS;
        boolean fechaDesdeMayorHotelDesde = (dias.between(this.disponibleDesde, fechaDesde) >= 0);
        boolean fechaHastaMenorHotelHasta = (dias.between(fechaHasta, this.disponibleHasta) >= 0);

        return (fechaDesdeMayorHotelDesde && fechaHastaMenorHotelHasta);
    }

    public boolean estaEnPeriodo(LocalDate fechaDesde, LocalDate fechaHasta) {
        ChronoUnit dias = ChronoUnit.DAYS;

        //  [hotelDesde.. [fechaDesde..fechaHasta]
        boolean fechaDesdeMayorHotelDesde = (dias.between(this.disponibleDesde, fechaDesde) >= 0);
        boolean fechaHastaMayorHotelDesde = (dias.between(this.disponibleDesde, fechaHasta) >= 0);
        boolean periodoMayorHotelDesde = fechaDesdeMayorHotelDesde || fechaHastaMayorHotelDesde;

        //                         [fechaDesde..fechaHasta]..hotelHasta]
        boolean fechaDesdeMenorHotelHasta = (dias.between(fechaDesde, this.disponibleHasta) >= 0);
        boolean fechaHastaMenorHotelHasta = (dias.between(fechaHasta, this.disponibleHasta) >= 0);
        boolean periodoMenorHotelHasta = fechaDesdeMenorHotelHasta || fechaHastaMenorHotelHasta;

        return periodoMayorHotelDesde && periodoMenorHotelHasta;
    }
}
