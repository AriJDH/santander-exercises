package com.caloriasStarWars.caloriasStarWars.service;

import com.caloriasStarWars.caloriasStarWars.dto.DishDTO;
import com.caloriasStarWars.caloriasStarWars.dto.ResponseDTO;

import java.util.List;

public interface DishService {
    public ResponseDTO calculate(DishDTO dish);
    public List<ResponseDTO> calculate(List<DishDTO> dishes);
}
