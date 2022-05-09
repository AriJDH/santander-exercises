package com.practica.obtenerdiploma.controller;

import com.practica.obtenerdiploma.exception.StudentNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ObtenerDiplomaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void analize() throws Exception {
       MvcResult mvcResult = this.mockMvc.perform(MockMvcRequestBuilders.get("/analyzeScores/{studentId}",2))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.message").value("El alumno Pedro ha obtenido un promedio de 7,33. Puedes mejorar."))
               .andReturn();
        Assertions.assertEquals("application/json",mvcResult.getResponse().getContentType());
        /*
        System.out.println("Hola esta es la clase: " + mvcResult.getClass().getSimpleName());
        System.out.println("Hola esta es la clase: " + mvcResult.getResponse().getContentAsString());
        
         */
    }

}