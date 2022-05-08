package com.santander.DesafioSpring.dtos.request;

import com.santander.DesafioSpring.dtos.BookingCreditCardDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RequestBookingDTO {
    private String userName;
    private BookingCreditCardDTO booking;
}
