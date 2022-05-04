package com.desafioSpring.desafio_spring.dto.response;

import com.desafioSpring.desafio_spring.dto.StatusDto;
import com.desafioSpring.desafio_spring.dto.response.ResponseFlightReservationDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class ResponsePayloadVuelosDto {

    // Clase para responder la reserva del vuelo
    private String userName;
    private double amount;
    private double interest;
    private double total;
    private ResponseFlightReservationDto flightReservationDto;
    private StatusDto statusCode;
}

