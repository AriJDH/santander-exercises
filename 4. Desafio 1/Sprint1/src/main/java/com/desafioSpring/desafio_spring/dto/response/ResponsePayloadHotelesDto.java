package com.desafioSpring.desafio_spring.dto.response;

import com.desafioSpring.desafio_spring.dto.StatusDto;
import com.desafioSpring.desafio_spring.dto.response.ResponseBookingDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class ResponsePayloadHotelesDto {

    //Clase para responder la reserva de hotel
    private String userName;
    private double amount;
    private double interest;
    private double total;
    private ResponseBookingDto BookingDto;
    private StatusDto statusCode;
}
