package com.santander.AgenciaDeTurismo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationCreditCardDTO extends ReservationDTO {
    private  CreditCardDTO paymentMethod;

}

