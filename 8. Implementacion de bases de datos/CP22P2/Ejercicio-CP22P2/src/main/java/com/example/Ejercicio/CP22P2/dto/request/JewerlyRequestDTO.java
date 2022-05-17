package com.example.Ejercicio.CP22P2.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JewerlyRequestDTO {

    private String nombre;
    private String material;
    private double weight;
    private String characteristics;
    private Boolean has_it;
    private Boolean isForSale;
}
