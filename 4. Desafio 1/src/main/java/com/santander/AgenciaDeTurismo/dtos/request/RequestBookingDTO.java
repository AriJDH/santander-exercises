package com.santander.AgenciaDeTurismo.dtos.request;

import com.santander.AgenciaDeTurismo.dtos.BookingCreditCardDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RequestBookingDTO {
    private String userName;
    private BookingCreditCardDTO booking;
}
