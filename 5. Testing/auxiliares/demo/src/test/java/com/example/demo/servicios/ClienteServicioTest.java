package com.example.demo.servicios;

import com.example.demo.dto.ClienteDto;
import com.example.demo.modelos.Cliente;
import com.example.demo.repo.ClienteRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ClienteServicioTest {

    @Mock
    private ClienteRepo clienteRepo;

    @InjectMocks
    ClienteServicio clienteServicio;

    @Test
    void getCliente(){
        //arrange
        ClienteDto clienteDtoEsperado = new ClienteDto();
        clienteDtoEsperado.setApellido("Gomez");
        clienteDtoEsperado.setNombre("María");

        //simular
        Cliente cliente = new Cliente();
        cliente.setNombre("María");
        cliente.setApellido("Gomez");

        when(clienteRepo.getCliente()).thenReturn(cliente);

        ClienteDto clienteDtoObtenido = clienteServicio.getCliente();

        assertEquals(clienteDtoEsperado, clienteDtoObtenido);
    }

    @Test
    void putCliente(){
        //arrange
        Cliente cliente = new Cliente();
        cliente.setApellido("Gomez");
        cliente.setNombre("María");

        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setApellido("Gomez");
        clienteDto.setNombre("María");

        //act
        clienteServicio.putCliente(clienteDto);

        //assert
        verify(clienteRepo, atLeastOnce()).putCliente(cliente);

    }

}
