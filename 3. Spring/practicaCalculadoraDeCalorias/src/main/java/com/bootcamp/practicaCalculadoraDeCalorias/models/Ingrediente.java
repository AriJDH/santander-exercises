package com.bootcamp.practicaCalculadoraDeCalorias.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Ingrediente {

    String name;
    int calories;

}
