package com.santander.AgenciaDeTurismo.dtos.request;

import com.santander.AgenciaDeTurismo.dtos.ReservationCreditCardDTO;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class RequestReservationDTO {

    private String userName;
    private ReservationCreditCardDTO flightReservation;
}
