package com.santander.DesafioSpring.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreditCardDTO {
    private String type;
    private String number;
    private int dues;
}
