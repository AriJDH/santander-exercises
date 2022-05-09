package com.practica.obtenerdiploma.util;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class MockMvcWrapper {

    public static MvcResult perform(MockMvc mockMvc, String endpoint, String payload, String expectedDescription){
        try {
            return mockMvc.perform(MockMvcRequestBuilders.post(endpoint)
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(payload))
                    .andDo(print()).andExpect(status().is4xxClientError())
                    .andExpect(content().contentType("application/json"))
                    .andExpect(MockMvcResultMatchers.jsonPath("$.description").value(expectedDescription))
                    .andReturn();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
