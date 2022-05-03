package com.bootcamp._desafio_spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RequestReservaVueloDto {
    private String nombreUsuario;
    private TicketDto ticket;
}
