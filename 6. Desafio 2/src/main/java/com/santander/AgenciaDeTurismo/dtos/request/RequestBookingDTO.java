package com.santander.AgenciaDeTurismo.dtos.request;

import com.santander.AgenciaDeTurismo.dtos.BookingCreditCardDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class RequestBookingDTO {

    @Email(message = "Por favor ingrese un e-mail valido")
    private String userName;
    @Valid
    private BookingCreditCardDTO booking;
}
