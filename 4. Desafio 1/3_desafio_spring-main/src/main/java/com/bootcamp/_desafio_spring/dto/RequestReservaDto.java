package com.bootcamp._desafio_spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RequestReservaDto {
    private String nombreUsuario;
    private BookingDto booking;
}
