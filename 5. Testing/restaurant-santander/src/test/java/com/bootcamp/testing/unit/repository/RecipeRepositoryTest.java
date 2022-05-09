package com.bootcamp.testing.unit.repository;

import com.bootcamp.testing.model.Recipe;
import com.bootcamp.testing.repository.RecipeRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class RecipeRepositoryTest {

    // inyeccion de dependencia.
    RecipeRepository recipeRepository;

    // TODO: anotaciones?
    void setup(){
        recipeRepository = new RecipeRepository();
    }

    @Test
    @DisplayName("Find a recipe w/ a valid name")
    void findRecipeWithCorrectName(){
        String name = "burguer";

        Optional<Recipe> recipe = recipeRepository.getRecipe(name);

    }

    @Test
    @DisplayName("find a recipe w/ an invalid name")
    void notFoundRecipeWithCorrectName(){

    }

    @Test
    @DisplayName("not find a recipe w/ an invalid name and it throws an exception")
    void notFoundRecipeWithCorrectNamea(){

    }

    @Test
    @DisplayName("not find the recipe if null")
    void notFoundRecipeWithNull(){

    }
}
