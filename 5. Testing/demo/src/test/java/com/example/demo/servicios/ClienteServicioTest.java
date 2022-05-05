package com.example.demo.servicios;

import com.example.demo.dto.ClienteDto;
import com.example.demo.modelos.Cliente;
import com.example.demo.repo.ClienteRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ClienteServicioTest {

    @Mock
    ClienteRepo clienteRepo;

    @InjectMocks
    ClienteServicio clienteServicio;

    @Test
    void getCliente() {
        // arrange
        ClienteDto clienteDtoEsperado = new ClienteDto();
        clienteDtoEsperado.setApellido("Gomez");
        clienteDtoEsperado.setNombre("Maria");

        // simular
        Cliente cliente = new Cliente();
        cliente.setNombre("Maria");
        cliente.setApellido("Gomez");
        when(clienteRepo.getCliente()).thenReturn(cliente);

        // act
        ClienteDto clienteDtoObtenido = clienteServicio.getCliente();


        // assert
        assertEquals(clienteDtoEsperado,clienteDtoObtenido);

    }

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

}
