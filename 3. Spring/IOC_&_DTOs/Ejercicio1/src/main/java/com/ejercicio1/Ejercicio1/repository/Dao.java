package com.ejercicio1.Ejercicio1.repository;

import com.ejercicio1.Ejercicio1.dto.request.IngredienteDTO;

import java.util.List;

public interface Dao {
    public double caloriasTotales(List<IngredienteDTO> e);

    public double obtenerCalorias(IngredienteDTO ingrediente);
}
