package com.bootcamp.EjercicioCP22P2.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewJewerlyResponseDTO {
    private String message;
    private int statusCode;
}
