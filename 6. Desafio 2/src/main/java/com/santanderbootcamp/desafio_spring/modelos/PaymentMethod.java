package com.santanderbootcamp.desafio_spring.modelos;

import com.santanderbootcamp.desafio_spring.validations.ValidacionCuotas;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ValidacionCuotas
public class PaymentMethod {

    //Datos utilizados por la clase de PaymentMethod
    @Pattern(regexp="^(DEBIT|CREDIT)$",message="Tipo de tarjeta invalido (CREDIT o DEBIT)")
    private String type;
    private String number;
    @Max(12)
    @Min(0)
    private int dues;
}
