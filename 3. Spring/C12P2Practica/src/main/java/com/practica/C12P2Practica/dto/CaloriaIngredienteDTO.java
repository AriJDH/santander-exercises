package com.practica.C12P2Practica.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CaloriaIngredienteDTO {
    private String nombre;
    private Double totalCalorias;
}
