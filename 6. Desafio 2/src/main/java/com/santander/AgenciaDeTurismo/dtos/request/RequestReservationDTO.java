package com.santander.AgenciaDeTurismo.dtos.request;

import com.santander.AgenciaDeTurismo.dtos.ReservationCreditCardDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Email;


@Data
@AllArgsConstructor
public class RequestReservationDTO {
    @Email(message = "Por favor ingrese un e-mail valido")
    private String userName;
    @Valid
    private ReservationCreditCardDTO flightReservation;
}
