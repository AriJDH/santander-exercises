package com.example.calculadoracalorias.service;

import com.example.calculadoracalorias.dto.DishDTO;
import com.example.calculadoracalorias.dto.DishResponseDTO;

import java.util.List;

public interface DishService {
  DishResponseDTO calculateCalories(DishDTO dish);

  List<DishResponseDTO> calculateAllCalories(List<DishDTO> dishes);
}
