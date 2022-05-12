package com.example.calculadoracalorias.controller;

import com.example.calculadoracalorias.dto.DishDTO;
import com.example.calculadoracalorias.dto.DishResponseDTO;
import com.example.calculadoracalorias.service.DishService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CalculateRestController {
  private final DishService dishService;

  public CalculateRestController(DishService dishService) {
    this.dishService = dishService;
  }

  @PostMapping("/calculate")
  public DishResponseDTO calculate(@RequestBody DishDTO dish){
    return dishService.calculateCalories(dish);
  }

  @PostMapping("/calculateAll")
  public List<DishResponseDTO> calculate(@RequestBody List<DishDTO> dishes){
    return dishService.calculateAllCalories(dishes);
  }
}
