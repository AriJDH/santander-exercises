package com.ejPOSTyResponse.ejPOSTyResponse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class PropiedadDTO {
    private String nombre,direccion;
    private ArrayList<HabitacionDTO> habitaciones;
}
