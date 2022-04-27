package com.practica.C12P2Starwars.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Personaje {
    private String name;
    private long height;
    private long mass;
}
