package com.santander.C12P2EjercicioPracticoCalculadoraCalorias.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Plato {
    private String nombre;
    private List<Ingrediente> ingredientes;
}
