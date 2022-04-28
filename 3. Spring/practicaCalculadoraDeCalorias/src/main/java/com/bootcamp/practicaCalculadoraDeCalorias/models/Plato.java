package com.bootcamp.practicaCalculadoraDeCalorias.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Plato {
    String nombre;
    List<Ingrediente> ingredientes;
}
