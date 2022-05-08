package com.santander.DesafioSpring.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingCreditCardDTO extends BookingDTO{
    private CreditCardDTO paymentMethod;
}
