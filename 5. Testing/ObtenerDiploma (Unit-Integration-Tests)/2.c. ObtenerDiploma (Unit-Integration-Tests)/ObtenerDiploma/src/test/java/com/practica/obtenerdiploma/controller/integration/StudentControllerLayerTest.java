package com.practica.obtenerdiploma.controller.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;
import com.practica.obtenerdiploma.repository.StudentDAO;
import com.practica.obtenerdiploma.service.IStudentService;
import com.practica.obtenerdiploma.service.StudentService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class StudentControllerLayerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    StudentDAO dao;

    StudentDTO s1= new StudentDTO();


    @BeforeEach
    public void setup(){
        s1.setStudentName("Valen");
        s1.setId(1L);
        SubjectDTO mates= new SubjectDTO("Mate",10.0);
        SubjectDTO fisica= new SubjectDTO("Fisica",5.0);
        List<SubjectDTO> subs= new ArrayList<>();
        subs.add(mates);
        subs.add(fisica);
        s1.setSubjects(subs);
        dao.save(s1);
    }

    @Test
    public void getStudent() throws Exception {
        ObjectWriter writer = new ObjectMapper().configure(SerializationFeature.WRAP_ROOT_VALUE,false).writer();
        MvcResult mvcResult=this.mockMvc.perform(MockMvcRequestBuilders.get("/student/getStudent/{id}","1"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andReturn();
        Assertions.assertEquals(writer.writeValueAsString(s1),mvcResult.getResponse().getContentAsString());

    }

    @Test
    public void removeStudent() throws Exception{
        this.mockMvc.perform(MockMvcRequestBuilders.get("/student/removeStudent/{id}","1"))
                .andDo(print()).andExpect(status().isOk());
    }

    @Test
    public void listStudents() throws Exception {
        Set<StudentDTO> set=new HashSet<>();
        set.add(s1);
        ObjectWriter writer = new ObjectMapper().configure(SerializationFeature.WRAP_ROOT_VALUE,false).writer();
        MvcResult mvcResult=this.mockMvc.perform(MockMvcRequestBuilders.get("/student/listStudents"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andReturn();
        Assertions.assertEquals(writer.writeValueAsString(set),mvcResult.getResponse().getContentAsString());

    }

    @Test
    public void modifyStudent() throws Exception{
        ObjectWriter writer = new ObjectMapper().configure(SerializationFeature.WRAP_ROOT_VALUE,false).writer();
        String payloadJson=writer.writeValueAsString(s1);
        this.mockMvc.perform(MockMvcRequestBuilders.post("/student/modifyStudent")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(payloadJson))
                .andDo(print()).andExpect(status().isOk());
    }

    @Test
    public void registerStudent() throws Exception {
        ObjectWriter writer = new ObjectMapper().configure(SerializationFeature.WRAP_ROOT_VALUE,false).writer();
        String payloadJson=writer.writeValueAsString(s1);
        this.mockMvc.perform(MockMvcRequestBuilders.post("/student/registerStudent")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(payloadJson))
                .andDo(print()).andExpect(status().isOk());
    }


}
