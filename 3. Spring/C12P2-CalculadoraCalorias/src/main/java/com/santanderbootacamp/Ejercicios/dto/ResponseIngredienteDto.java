package com.santanderbootacamp.Ejercicios.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseIngredienteDto {
    String name;
    Integer calories;
}