package com.example.demo.servicios;

import com.example.demo.dto.ClienteDto;
import com.example.demo.modelos.Cliente;
import com.example.demo.repo.ClienteRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class ClienteServicioTest {

    @Mock
    ClienteRepo clienteRepo;

    @InjectMocks
    ClienteServicio clienteServicio;

    @Test
    void getCliente(){

        // Arrange
        ClienteDto clienteDtoEsperado = new ClienteDto();
        clienteDtoEsperado.setApellido("Salvia");
        clienteDtoEsperado.setNombre("Facundo");

            // simular
        Cliente cliente = new Cliente();
        cliente.setNombre("Facundo");
        cliente.setApellido("Salvia");

        when(clienteRepo.getCliente()).thenReturn(cliente);

        // Act
        ClienteDto clienteDtoObtenido = clienteServicio.getCliente();
        // Assert
        assertEquals(clienteDtoEsperado,clienteDtoObtenido);

    }
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

    }
}
