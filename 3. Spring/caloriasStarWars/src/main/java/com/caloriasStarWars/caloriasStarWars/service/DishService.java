package com.caloriasStarWars.caloriasStarWars.service;

import com.caloriasStarWars.caloriasStarWars.dto.DishDTO;
import com.caloriasStarWars.caloriasStarWars.dto.ResponseDTO;

public interface DishService {
    public ResponseDTO calculate(DishDTO dish);
}
