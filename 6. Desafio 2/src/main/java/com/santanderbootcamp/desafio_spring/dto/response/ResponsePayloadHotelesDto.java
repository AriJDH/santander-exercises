package com.santanderbootcamp.desafio_spring.dto.response;

import com.santanderbootcamp.desafio_spring.dto.StatusDto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponsePayloadHotelesDto {

    //Clase para responder la reserva de hotel
    private String userName;
    private double amount;
    private double interest;
    private double total;
    private ResponseBookingDto booking;
    private StatusDto statusCode;
}
