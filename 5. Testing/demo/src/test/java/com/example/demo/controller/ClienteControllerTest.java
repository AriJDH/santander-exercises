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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class ClienteControllerTest {

    @Mock
    ClienteServicio clienteServicio;

    @InjectMocks
    ClienteController clienteController;

    @Test
    void getCliente(){

        // Arrange
        ClienteDto clienteDtoEsperado = new ClienteDto();
        clienteDtoEsperado.setApellido("Salvia");
        clienteDtoEsperado.setNombre("Facundo");

        // simular
        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setNombre("Facundo");
        clienteDto.setApellido("Salvio");

        when(clienteServicio.getCliente()).thenReturn(clienteDto);

        // Act
        ClienteDto clienteDtoObtenido = clienteController.getCliente();
        // Assert
        assertEquals(clienteDtoEsperado,clienteDtoObtenido);

    }
    /*
    @Test
    void putCliente(){
        //Arrange
        Cliente cliente = new Cliente();
        cliente.setApellido("Salvia");
        cliente.setNombre("Facundo");

        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setApellido("Salvia");
        clienteDto.setNombre("Facundo");

        //Act

        clienteServicio.putCliente(clienteDto);

        //Assert
        verify(clienteRepo, atLeastOnce()).putCliente(cliente);

    }*/
}
