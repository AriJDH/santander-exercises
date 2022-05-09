package com.practica.obtenerdiploma.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.util.TestUtilsGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.asm.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import java.util.HashSet;
import java.util.List;
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
    public void shouldReturnAStudentWhenOneExists() throws Exception{
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
    public void shouldReturnAListWithOneStudentWhenOneExists() throws Exception{
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
    public void shouldReturnAnEmptyListWhenThereAreNoStudents() throws Exception{
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

    @Nested
    class WhenThereAreNoStudents {

        @Autowired
        private MockMvc mockMvc;

        private final ObjectWriter writer = new ObjectMapper().
                configure(SerializationFeature.WRAP_ROOT_VALUE, false).
                writer().withDefaultPrettyPrinter();

        private MvcResult executePerform(String endpoint, String payload, String expectedDescription){
            try {
                return this.mockMvc.perform(MockMvcRequestBuilders.post(endpoint)
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

        @BeforeEach
        void setUp(){
            TestUtilsGenerator.emptyUsersFile();
        }

        @Test
        public void shouldReturnOKWhenAddingANewStudent(){
            StudentDTO studentDTO = TestUtilsGenerator.getStudentWithId(1L);
            studentDTO.setStudentName("Juan");

            String payloadJson = "";
            try {
                payloadJson = writer.writeValueAsString(studentDTO);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }

            MvcResult mvcResult = null;
            try {
                mvcResult = this.mockMvc.perform(MockMvcRequestBuilders.post("/student/registerStudent")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(payloadJson))
                        .andDo(print()).andExpect(status().isOk())
                        //.andExpect(content().contentType("application/json"))
                        //.andExpect(MockMvcResultMatchers.jsonPath("$.studentName").value("Juan"))
                        .andReturn();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Test
        public void shouldReturnErrorIfStudentNameIsInvalid(){
            StudentDTO studentDTO = TestUtilsGenerator.getStudentWithId(1L);
            studentDTO.setStudentName("notienemayus");

            String payloadJson = "";
            try {
                payloadJson = writer.writeValueAsString(studentDTO);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }

            MvcResult mvcResult = null;

            mvcResult = executePerform("/student/registerStudent", payloadJson, "El nombre del estudiante debe comenzar con mayúscula.");
            
            Assertions.assertEquals("application/json",mvcResult.getResponse().getContentType());
        }

    }


}
