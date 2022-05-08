package com.santander.DesafioSpring.dtos.request;

import com.santander.DesafioSpring.dtos.ReservationCreditCardDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RequestReservationDTO {

    private String userName;
    private ReservationCreditCardDTO flightReservation;
}
