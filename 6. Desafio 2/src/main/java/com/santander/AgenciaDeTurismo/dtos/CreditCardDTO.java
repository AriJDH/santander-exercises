package com.santander.AgenciaDeTurismo.dtos;

import com.santander.AgenciaDeTurismo.validations.DebitCardDues;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@DebitCardDues
public class CreditCardDTO {
    @Pattern(regexp = "(CREDIT)|(DEBIT)", message = "La tarjeta debe ser de tipo CREDIT o DEBIT")
    private String type;
    @Pattern(regexp = "[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}", message = "Formato de tarjeta invalido. Debe ser 1234-1234-1234-1234")
    private String number;
    @Min(value = 1, message = "Se debe pagar en al menos una cuota")
    private int dues;
}
