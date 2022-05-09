package com.bootcamp.testing.unit.service;

import com.bootcamp.testing.model.Ingredient;
import com.bootcamp.testing.model.Recipe;
import com.bootcamp.testing.repository.RecipeRepository;
import com.bootcamp.testing.repository.StorehouseRepository;
import com.bootcamp.testing.service.KitchenService;
import com.bootcamp.testing.utils.IngredientFactory;
import com.bootcamp.testing.utils.RecipeFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class KitchenServiceTest {

    @Mock
    RecipeRepository recipeRepository;
    @Mock
    StorehouseRepository storehouseRepository;

    @InjectMocks
    KitchenService kitchenService;

    @Test
    @DisplayName("Check if calories calculation is correct")
    void test1(){
        String name = "burger";
        Optional<Recipe> expected = Optional.of(RecipeFactory.createBurguer());

        //OJO: pasa por referencia, asi que me modifica el buergerMock, t
        //tengo que hacer un expected con una nueva burguer
        Optional<Recipe> burgerMock = Optional.of(RecipeFactory.createBurguer());
        Optional<Ingredient> breadMock = Optional.of(IngredientFactory.getBread());
        Optional<Ingredient> mealMock = Optional.of(IngredientFactory.getMeal());

        when(recipeRepository.getRecipe(name)).thenReturn(burgerMock);
        when(storehouseRepository.getIngredient("bread")).thenReturn(breadMock);
        when(storehouseRepository.getIngredient("meal")).thenReturn(mealMock);

        Recipe burguer = kitchenService.createDish(name);

        assertEquals(expected.get(), burguer);
    }

    @Test
    @DisplayName("Check if quality calculation is correct")
    void test2(){

    }

    @Test
    @DisplayName("Check if it throws an exception while not finding a recipe")
    void test3(){

    }

    @Test
    @DisplayName("Check if all info of expected and result is equal")
    void test4(){

    }
}
