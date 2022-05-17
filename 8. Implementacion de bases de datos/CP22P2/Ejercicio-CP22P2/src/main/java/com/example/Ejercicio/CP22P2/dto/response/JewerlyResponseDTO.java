package com.example.Ejercicio.CP22P2.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JewerlyResponseDTO {

    private String nombre;
    private String material;
    private double weight;
    private String characteristics;
    private Boolean has_it;
    private Boolean isForSale;
}
