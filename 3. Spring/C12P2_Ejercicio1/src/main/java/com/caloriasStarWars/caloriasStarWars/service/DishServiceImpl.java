package com.caloriasStarWars.caloriasStarWars.service;

import com.caloriasStarWars.caloriasStarWars.dto.DishDTO;
import com.caloriasStarWars.caloriasStarWars.dto.IngredientDTO;
import com.caloriasStarWars.caloriasStarWars.dto.ResponseDTO;
import com.caloriasStarWars.caloriasStarWars.model.Dish;
import com.caloriasStarWars.caloriasStarWars.model.Ingredient;
import com.caloriasStarWars.caloriasStarWars.repository.DAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DishServiceImpl implements DishService{
    @Autowired
    private DAO repo;
    private static final Logger LOGGER = LoggerFactory.getLogger(DishServiceImpl.class);


    public ResponseDTO calculate(DishDTO dish){
        Dish plato=construirPlato(dish);
        Ingredient ingredienteMayor= plato.buscarIngredienteConMasCalorias();
        IngredientDTO ingredienteConMasCalorias = new IngredientDTO(ingredienteMayor.getName(), ingredienteMayor.getPeso(),ingredienteMayor.getCalories());
        return new ResponseDTO(ingredienteConMasCalorias,plato.calcularCaloriasTotal(),plato.getIngredientes());
    }


    private Dish construirPlato(DishDTO dishDto){
        Dish plato = new Dish();
        List<IngredientDTO> ingredientesDto = dishDto.getIngredientes();
        plato.setName(dishDto.getName());
        plato.agregarIngredientes(obtenerIngredientes(ingredientesDto));

        return plato;
    }




    private List<Ingredient> obtenerIngredientes(List<IngredientDTO> ingredientesDto){
        List<Ingredient> ingredientes =ingredientesDto.stream().map(
                i -> new Ingredient(i.getNombre(),i.getPeso())
        ).collect(Collectors.toList());
        ingredientes
                .forEach(i-> i.setCalories((int) (i.getPeso()*(repo.getElemento(i.getName())
                .getCalories())/100)));
        return ingredientes;
    }



}
