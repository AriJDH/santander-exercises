package com.bootcamp.EjercicioCP22P2.dtos;

import com.bootcamp.EjercicioCP22P2.models.Jewerly;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateJewerlyResponseDTO {
    private String message;
    private int statusCode;
    JewerlyDTO jewerlyDTO;
}
