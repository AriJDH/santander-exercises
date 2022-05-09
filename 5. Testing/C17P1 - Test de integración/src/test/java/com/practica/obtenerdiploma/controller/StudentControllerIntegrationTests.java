package com.practica.obtenerdiploma.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.util.TestUtilsGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.asm.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import java.util.HashSet;
import java.util.Set;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentControllerIntegrationTests {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testGetStudent() throws Exception{
        TestUtilsGenerator.emptyUsersFile();
        StudentDTO studentDTO = TestUtilsGenerator.getStudentWithId(1L);
        studentDTO.setStudentName("Juan");
        TestUtilsGenerator.appendNewStudent(studentDTO);

        MvcResult mvcResult =
                this.mockMvc.perform(MockMvcRequestBuilders.get("/student/getStudent/{id}",1))
                        .andDo(print()).andExpect(status().isOk())
                        .andExpect(content().contentType("application/json"))
                        .andExpect(MockMvcResultMatchers.jsonPath("$.studentName").value("Juan"))
                        .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1))
                        .andExpect(MockMvcResultMatchers.jsonPath("$.subjects").isNotEmpty())
                        .andReturn();
        Assertions.assertEquals("application/json",mvcResult.getResponse().getContentType());


    }

    @Test
    public void testListStudentsWhenHasOneElement() throws Exception{
        TestUtilsGenerator.emptyUsersFile();
        StudentDTO studentDTO = TestUtilsGenerator.getStudentWithId(1L);
        studentDTO.setStudentName("Juan");
        TestUtilsGenerator.appendNewStudent(studentDTO);

        MvcResult mvcResult =
                this.mockMvc.perform(MockMvcRequestBuilders.get("/student/listStudents"))
                        .andDo(print()).andExpect(status().isOk())
                        .andExpect(content().contentType("application/json"))
                        .andExpect(MockMvcResultMatchers.jsonPath("$[0].studentName").value("Juan"))
                        .andReturn();
        Assertions.assertEquals("application/json",mvcResult.getResponse().getContentType());

    }

    @Test
    public void testListStudentsWhenHasntElements() throws Exception{
        TestUtilsGenerator.emptyUsersFile();
        MvcResult mvcResult =
                this.mockMvc.perform(MockMvcRequestBuilders.get("/student/listStudents"))
                        .andDo(print()).andExpect(status().isOk())
                        .andExpect(content().contentType("application/json"))
                        .andReturn();
        String response = mvcResult.getResponse().getContentAsString();
        Assertions.assertEquals("application/json",mvcResult.getResponse().getContentType());
        Assertions.assertEquals("[]",response);

    }


}
