package com.example.demo.controller;

import com.example.demo.controllers.ClienteController;
import com.example.demo.dto.ClienteDto;
import com.example.demo.modelos.Cliente;
import com.example.demo.repo.ClienteRepo;
import com.example.demo.servicios.ClienteServicio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(clienteDtoEsperado,clienteDtoObtenido);

    }

    /*
    @Test
    void putCliente() {
        // arrange
        Cliente cliente = new Cliente();
        cliente.setApellido("Gomez");
        cliente.setNombre("Maria");

        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setApellido("Gomez");
        clienteDto.setNombre("Maria");

        // act
        clienteServicio.putCliente(clienteDto);

        // assert
        verify(clienteRepo, atLeastOnce() ).putCliente(cliente);

    }
*/
}
