package com.bootcamp.testing.unit.repository;

import com.bootcamp.testing.model.Recipe;
import com.bootcamp.testing.repository.RecipeRepository;
import com.bootcamp.testing.utils.RecipeFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeRepositoryTest {

    // inyeccion de dependencia.
    RecipeRepository recipeRepository;

    @BeforeEach
    void setup(){
        recipeRepository = new RecipeRepository();
    }

    @Test
    @DisplayName("Find a recipe w/ a valid name")
    void findRecipeWithCorrectName(){
        String name = "burger";
        Recipe expected = RecipeFactory.createBurguer();

        Optional<Recipe> recipe = recipeRepository.getRecipe(name);

        assertAll(() -> assertTrue(recipe.isPresent()),
                () -> assertEquals(expected, recipe.get()));
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
