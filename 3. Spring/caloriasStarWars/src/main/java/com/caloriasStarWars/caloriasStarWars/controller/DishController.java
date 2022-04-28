package com.caloriasStarWars.caloriasStarWars.controller;

import com.caloriasStarWars.caloriasStarWars.dto.DishDTO;
import com.caloriasStarWars.caloriasStarWars.dto.IngredientDTO;
import com.caloriasStarWars.caloriasStarWars.dto.ResponseDTO;
import com.caloriasStarWars.caloriasStarWars.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DishController{
    @Autowired
    private DishService service;


    @PostMapping("/calculate")
    public ResponseEntity<ResponseDTO> calculate(@RequestBody DishDTO dish){
        return new ResponseEntity<>(service.calculate(dish), HttpStatus.OK);
    }
}
