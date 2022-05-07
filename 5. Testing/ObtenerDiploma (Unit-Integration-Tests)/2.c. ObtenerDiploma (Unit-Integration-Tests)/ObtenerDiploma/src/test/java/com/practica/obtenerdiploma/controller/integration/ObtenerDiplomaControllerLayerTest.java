package com.practica.obtenerdiploma.controller.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ObtenerDiplomaControllerLayerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    StudentDAO dao;

    StudentDTO s1= new StudentDTO();


    @BeforeEach
    public void setup(){
        s1.setStudentName("valen");
        s1.setId(1L);
        SubjectDTO mates= new SubjectDTO("mate",10.0);
        SubjectDTO fisica= new SubjectDTO("fisica",5.0);
        List<SubjectDTO> subs= new ArrayList<>();
        subs.add(mates);
        subs.add(fisica);
        s1.setSubjects(subs);
        dao.save(s1);
    }
    @Test
    public void analyzeScores() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/analyzeScores/{studentId}","1"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.averageScore").value("7.5"));
    }
}
