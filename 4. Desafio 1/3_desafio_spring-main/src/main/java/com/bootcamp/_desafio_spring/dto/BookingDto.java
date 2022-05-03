package com.bootcamp._desafio_spring.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
public class BookingDto extends BookingDtoBase{

    private final MetodoPagoDto metodoPago;

    public BookingDto(LocalDate desde, LocalDate hasta, String destino, String codigoHotel, int cantidadPersonas, String tipoHabitacion, List<PersonaDto> personas, MetodoPagoDto metodoPago) {
        super(desde, hasta, destino, codigoHotel, cantidadPersonas, tipoHabitacion, personas);
        this.metodoPago = metodoPago;
    }

}
