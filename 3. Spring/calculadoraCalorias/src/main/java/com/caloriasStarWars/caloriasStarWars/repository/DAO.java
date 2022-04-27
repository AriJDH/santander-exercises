package com.caloriasStarWars.caloriasStarWars.repository;

import com.caloriasStarWars.caloriasStarWars.dto.IngredientDTO;
import com.caloriasStarWars.caloriasStarWars.model.Ingredient;

public interface DAO<K,E> {
    public Ingredient getElemento(K nombre);
}
