package com.example.demo.controller;

import com.example.demo.controllers.ClienteController;
import com.example.demo.dto.ClienteDto;
import com.example.demo.modelos.Cliente;
import com.example.demo.repo.ClienteRepo;
import com.example.demo.servicios.ClienteServicio;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
public class ClienteControllerTest {


    @Mock
    ClienteServicio clienteServicio;

    @InjectMocks
    ClienteController clienteController;

    @Test
    void getCliente() {
        // arrange
        ClienteDto clienteDtoEsperado = new ClienteDto();
        clienteDtoEsperado.setApellido("Gomez");
        clienteDtoEsperado.setNombre("Maria");

        // simular
        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setNombre("Maria");
        clienteDto.setApellido("Gomez");
        when(clienteServicio.getCliente()).thenReturn(clienteDto);

        // act
        ClienteDto clienteDtoObtenido = clienteController.getCliente();

        // assert
        assertEquals(clienteDtoEsperado, clienteDtoObtenido);

    }



}