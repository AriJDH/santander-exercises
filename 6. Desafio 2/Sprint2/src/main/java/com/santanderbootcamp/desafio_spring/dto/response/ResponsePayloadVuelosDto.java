package com.santanderbootcamp.desafio_spring.dto.response;

import com.santanderbootcamp.desafio_spring.dto.StatusDto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponsePayloadVuelosDto {

    // Clase para responder la reserva del vuelo
    private String userName;
    private double amount;
    private double interest;
    private double total;
    private ResponseFlightReservationDto flightReservation;
    private StatusDto statusCode;
}

