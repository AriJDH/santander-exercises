package com.example.demo.servicios;

import com.example.demo.dto.ClienteDto;
import com.example.demo.modelos.Cliente;
import com.example.demo.repo.ClienteRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ClienteServicioTest {

    @Mock
    private ClienteRepo clienteRepo;

    @InjectMocks
    private ClienteServicio clienteServicio;

    @Test
    void getCliente() {
        // arrange
        ClienteDto clienteDtoEsperado = new ClienteDto("Juan", "Carlos");

        Cliente cliente = new Cliente("Juan", "Carlos");
        when(clienteRepo.getCliente()).thenReturn(cliente);

        // act
        ClienteDto clienteDtoObtenido = clienteServicio.getCliente();

        // assert
        verify(clienteRepo, atLeast(1)).getCliente();
        assertEquals(clienteDtoObtenido, clienteDtoEsperado);

    }

    @Test
    void putCliente() {
        // arrange
        ClienteDto clienteDto = new ClienteDto("Agus", "Lego");
        Cliente cliente = new Cliente("Agus", "Lego");

        // act
        clienteServicio.putCliente(clienteDto);

        //assert
        verify(clienteRepo, atLeast(1)).putCliente(cliente);
    }
}