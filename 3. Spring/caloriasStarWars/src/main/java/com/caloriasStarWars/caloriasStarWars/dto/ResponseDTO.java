package com.caloriasStarWars.caloriasStarWars.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Optional;

@Data
@Getter
@Setter

public class ResponseDTO{
    private IngredientDTO most;
    private double totalCalorias;
    private DishDTO d1;
    public ResponseDTO(DishDTO d1){
        this.d1= d1;
    }

}
