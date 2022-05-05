package com.example.demo.controllers;

import com.example.demo.dto.ClienteDto;
import com.example.demo.servicios.ClienteServicio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

class ClienteControllerTest {

    @Mock
    private ClienteServicio clienteServicio;

    @InjectMocks
    private ClienteController clienteController;

    @Test
    void getCliente() {
        ClienteDto clienteDtoEsperado = new ClienteDto("Agus", "Carlos");
        when(clienteServicio.getCliente()).thenReturn(clienteDtoEsperado);

        ClienteDto clienteDtoObtenido = clienteController.getCliente();

        assertEquals(clienteDtoObtenido, clienteDtoEsperado);
        verify(clienteServicio, atLeast(1)).getCliente();


    }

    @Test
    void putCliente() {
    }
}