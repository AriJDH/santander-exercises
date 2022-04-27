package com.practica.C12P2Practica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*OJO: al parecer el ObjectMapper necesita el setter*/
@Setter
public class Ingrediente {
    private String name;
    private Double calories;
}
