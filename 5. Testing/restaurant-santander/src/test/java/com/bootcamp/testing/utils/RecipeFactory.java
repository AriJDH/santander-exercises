package com.bootcamp.testing.utils;

import com.bootcamp.testing.model.Ingredient;
import com.bootcamp.testing.model.Recipe;

import java.util.Arrays;
import java.util.List;

public class RecipeFactory {

    public static Recipe createPizza(){
        Ingredient tomato = IngredientFactory.getTomaco();

        Ingredient bread = IngredientFactory.getBread();

        List<Ingredient> ingredients = Arrays.asList(tomato, bread);

        Recipe expected = new Recipe();
        expected.setName("pizza");
        expected.setDescription("lorem ipsum");
        expected.setIngredients(ingredients);

        return expected;
    }

    public static Recipe createBurguer() {
        Ingredient bread = IngredientFactory.getBread();
        Ingredient meat = IngredientFactory.getMeal();

        List<Ingredient> ingredients = Arrays.asList(bread, meat);

        Recipe expected = new Recipe();
        expected.setName("burger");
        expected.setDescription("lorem ipsum");
        expected.setIngredients(ingredients);

        expected.setCalories(17.2D);
        expected.setQuality(1.0D);

        return expected;

    }
}
