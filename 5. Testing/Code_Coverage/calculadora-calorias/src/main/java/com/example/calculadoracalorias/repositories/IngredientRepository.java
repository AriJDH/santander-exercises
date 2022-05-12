package com.example.calculadoracalorias.repositories;

import com.example.calculadoracalorias.dto.IngredientDTO;

public interface IngredientRepository {
  IngredientDTO findIngredientByName(String name);
}
