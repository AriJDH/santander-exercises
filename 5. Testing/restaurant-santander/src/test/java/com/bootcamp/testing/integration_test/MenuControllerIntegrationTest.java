package com.bootcamp.testing.integration_test;

import com.bootcamp.testing.model.Recipe;
import com.bootcamp.testing.utils.RecipeFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class MenuControllerIntegrationTest {
    @Autowired
    // si instanciamos a mano corremo sle riesgo de generar varias instancias
    MockMvc mockMvc;

    @Test
    // get, delete
    @DisplayName("demo integration test w/method GET")
    void test1() throws Exception {
        // Factory writer, que nos de siempre el mismo writer
        ObjectWriter writer = new ObjectMapper().registerModule(new JavaTimeModule()).writer();

        // Arrange
        List<Recipe> listExpected = new ArrayList<>();

        File file;
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Recipe>> typeRef = new TypeReference<>() {
        };

        try {
            file    = ResourceUtils.getFile("classpath:recipes.json");
            listExpected = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String listJson = writer.writeValueAsString(listExpected);

        //EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(listJson);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType("application/json");

        //Request
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/menu");

        //ALTERNATIVAS
        //Path variable
        MockHttpServletRequestBuilder requestBuilderPathVariable = MockMvcRequestBuilders
                .get("/menu/{id}/{name}", 1, "juan");

        //Request Params
        MockHttpServletRequestBuilder requestBuilderRequestParam = MockMvcRequestBuilders
                .get("/menu")
                .param("id", "1")
                .param("name", "juan");

        //Se pueden combinar ambas
        //FIN ALTERNATIVAS

        mockMvc
                .perform(requestBuilder)
                .andDo(MockMvcResultHandlers.print())
                .andExpectAll(
                        expectedStatus,
                        expectedJson,
                        expectedContentType
                );

    }

    @Test
    //Post, patch, update
    @DisplayName("demo integration test w/method POST")
    void test2() throws Exception {
        ObjectWriter writer = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .writer();

        
    }
}
