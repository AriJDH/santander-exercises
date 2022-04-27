package com.ejPOSTyResponse.ejPOSTyResponse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class HabitacionDTO {
    private String nombre;
    private double ancho, largo;
}
