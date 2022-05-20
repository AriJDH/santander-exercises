package com.practica.obtenerdiploma.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import com.practica.obtenerdiploma.util.TestUtilsGenerator;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class IntegrationTestStudentController {
    @Autowired
    MockMvc mockMvc;

    private static ObjectWriter writer;

    @BeforeAll
    public static void setUp() {
        writer = new ObjectMapper()
                .configure(SerializationFeature.WRAP_ROOT_VALUE, false)
                .writer().withDefaultPrettyPrinter();

    }

    @Order(1)
    @Test
    void registerStudent() throws Exception {

        String requestBody= writer.writeValueAsString(TestUtilsGenerator.getStudentWith3Subjects("Pepe"));
        //EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();

        // REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/student/registerStudent").contentType(MediaType.APPLICATION_JSON).content(requestBody);

        mockMvc
                .perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(
                        expectedStatus
                );
    }

    @Order(2)
    @Test
    void getStudent() throws Exception {
        StudentDTO studentDTO= TestUtilsGenerator.getStudentWith3Subjects("Pepe");
        studentDTO.setId(2L);
        String responseBody= writer.writeValueAsString(studentDTO);
        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(responseBody);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/student/getStudent/{id}",2L);

        mockMvc
                .perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(
                        expectedStatus
                )
                .andExpect(expectedJson)
                .andExpect(expectedContentType);
    }

    @Order(3)
    @Test
    void modifyStudent() throws Exception {
        StudentDTO studentDTO= TestUtilsGenerator.getStudentWith3SubjectsAverageOver9("Pepe");
        studentDTO.setId(2L);

        String requestBody= writer.writeValueAsString(studentDTO);
        //EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();

        // REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/student/modifyStudent").contentType(MediaType.APPLICATION_JSON).content(requestBody);

        mockMvc
                .perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(
                        expectedStatus
                );
    }

    @Order(4)
    @Test
    void removeStudent() throws Exception {

        //EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();

        // REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/student/removeStudent/{id}",2L);

        mockMvc
                .perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(
                        expectedStatus
                );
    }

    @Order(5)
    @Test
    void listStudents() throws Exception {
        Set<StudentDTO> responseStudent= new HashSet<>();
        responseStudent.addAll(TestUtilsGenerator.loadDataBaseHoteles());

        String responseBody= writer.writeValueAsString(responseStudent);

        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedJson = MockMvcResultMatchers.content().json(responseBody);
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/student/listStudents");

        mockMvc
                .perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(expectedStatus)
                .andExpect(expectedJson)
                .andExpect(expectedContentType);



    }

    @Order(7)
    @Test
    void getRepository() throws Exception {


        // EXPECTED
        ResultMatcher expectedStatus = MockMvcResultMatchers.status().isOk();
        ResultMatcher expectedContentType = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);

        // REQUEST
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/student/repository/{id}",1L);

        mockMvc
                .perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(expectedStatus)
                .andExpect(MockMvcResultMatchers.content().string("true"))
                .andExpect(expectedContentType);
    }
}