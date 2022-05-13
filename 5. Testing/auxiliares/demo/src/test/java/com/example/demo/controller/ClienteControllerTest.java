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
    private ClienteServicio clienteServicio;

    @InjectMocks
    ClienteController clienteController;

    @Test
    void getCliente(){
        //arrange
        ClienteDto clienteDtoEsperado = new ClienteDto();
        clienteDtoEsperado.setApellido("Gomez");
        clienteDtoEsperado.setNombre("María");

        //simular
        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setNombre("María");
        clienteDto.setApellido("Gomez");

        when(clienteServicio.getCliente()).thenReturn(clienteDto);

        ClienteDto clienteDtoObtenido = clienteController.getCliente();

        assertEquals(clienteDtoEsperado, clienteDtoObtenido);
    }

    /*
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

    }*/

}
