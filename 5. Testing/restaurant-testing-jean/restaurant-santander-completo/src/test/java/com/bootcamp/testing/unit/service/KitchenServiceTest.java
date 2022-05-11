package com.bootcamp.testing.unit.service;

import com.bootcamp.testing.exception.notfound.RecipeNotFoundException;
import com.bootcamp.testing.model.Ingredient;
import com.bootcamp.testing.model.Recipe;
import com.bootcamp.testing.repository.RecipeRepository;
import com.bootcamp.testing.repository.StorehouseRepository;
import com.bootcamp.testing.repository.interfaces.IRecipeRepository;
import com.bootcamp.testing.repository.interfaces.IStorehouseRepository;
import com.bootcamp.testing.service.IKitchenService;
import com.bootcamp.testing.service.KitchenService;
import com.bootcamp.testing.utils.IngredientFactory;
import com.bootcamp.testing.utils.RecipeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static com.bootcamp.testing.utils.IngredientFactory.getBreadMock;
import static com.bootcamp.testing.utils.IngredientFactory.getTomacoMock;
import static com.bootcamp.testing.utils.RecipeFactory.createPizza;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class KitchenServiceTest {

    @Mock
    IRecipeRepository     recipeRepository;
    @Mock
    IStorehouseRepository storehouseRepository;

    @InjectMocks
    KitchenService kitchenService;


    @Test
    @DisplayName(" Comprobar el correcto calculo de calorias de un plato ")
    void test1(){
        // arrange
        String dishName = "pizza";
        Double caloriasExpected = 9.2D;
        // act
        Recipe resultRecipe = kitchenService.createDish(dishName);
        // assert
        assertEquals(caloriasExpected, resultRecipe.getCalories());
    }

    @Test
    @DisplayName(" Comprobar el correcto calculo de calidad de un plato ")
    void test2(){
        // arrange
        String dishName = "pizza";
        Double qualityExpected = 5D;
        Recipe recipeMock = createPizza();
        Ingredient tomaco = getTomacoMock();
        Ingredient bread = getBreadMock();
        // MOCK
        when(recipeRepository.getRecipe(dishName)).thenReturn(Optional.of(recipeMock));
/*        Mockito.when(storehouseRepository.getIngredient("tomato")).thenReturn(Optional.of(tomaco));
        Mockito.when(storehouseRepository.getIngredient("bread")).thenReturn(Optional.of(bread));*/
        when(storehouseRepository.getIngredient(anyString())).thenReturn(Optional.of(tomaco));

        // act
        Recipe resultRecipe = kitchenService.createDish(dishName);
        // assert
        assertEquals(qualityExpected, resultRecipe.getQuality());
        verify(storehouseRepository, times(2)).getIngredient(anyString());

        //multipĺes assert
        // verify
        // import static
    }

    @Test
    @DisplayName(" Comprobar que se lanza una exception cuando no encontramos una receta")
    void test3(){
        // arrange
        String dishName = "NOT_FOUND";
        // MOCK
        when(recipeRepository.getRecipe(anyString())).thenReturn(Optional.empty());

        // act & assert
        Assertions.assertThrows(RecipeNotFoundException.class, () -> kitchenService.createDish(anyString()));
    }

    @Test
    @DisplayName(" Comprobar que los objectos son iguales")
    void test4(){
        // arrange
        String dishName = "pizza";
        Double qualityExpected = 5D;
        Recipe recipeMock = createPizza();
        Ingredient tomaco = getTomacoMock();
        Ingredient bread = getBreadMock();
        // MOCK
        when(recipeRepository.getRecipe(dishName)).thenReturn(Optional.of(recipeMock));
/*        Mockito.when(storehouseRepository.getIngredient("tomato")).thenReturn(Optional.of(tomaco));
        Mockito.when(storehouseRepository.getIngredient("bread")).thenReturn(Optional.of(bread));*/
        when(storehouseRepository.getIngredient(anyString())).thenReturn(Optional.of(tomaco));

        // act
        Recipe resultRecipe = kitchenService.createDish(dishName);
        // assert
        assertAll(
          () -> assertEquals(qualityExpected, resultRecipe.getQuality()),
          () -> assertEquals(2D, resultRecipe.getCalories(), "Fail Calories"),
          () -> assertEquals("nopizza", resultRecipe.getName(), "Fail Name"),
          () -> verify(storehouseRepository, times(3)).getIngredient(anyString())
        );

        //Mockito.verify(storehouseRepository, Mockito.times(3)).getIngredient(Mockito.anyString());

        //multipĺes assert
        // verify
        // import static
    }
}
