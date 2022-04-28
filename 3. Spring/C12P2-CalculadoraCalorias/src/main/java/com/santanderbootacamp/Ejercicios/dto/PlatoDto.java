package com.santanderbootacamp.Ejercicios.dto;

import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlatoDto {
    private String name;
    private List<RequestIngredienteDto> ingredientes;
}

/*
{
    "name": "Pollo Frito",
    "ingredientes": [
        {
           "name": "Harina de maíz",
           "quantity": 200
        },
        {
           "name": "Pollo",
           "quantity": 1000
        }
    ]
}
 */