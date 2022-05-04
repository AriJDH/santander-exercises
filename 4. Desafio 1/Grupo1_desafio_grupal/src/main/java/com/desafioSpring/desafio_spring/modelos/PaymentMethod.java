package com.desafioSpring.desafio_spring.modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PaymentMethod {

    //Datos utilizados por la clase de PaymentMethod
    private String type;
    private String number;
    private int dues;

}
