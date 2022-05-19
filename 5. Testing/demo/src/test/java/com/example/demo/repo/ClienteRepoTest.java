package com.example.demo.repo;

import com.example.demo.modelos.Cliente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClienteRepoTest {

    ClienteRepo clienteRepo;

    void setup(){
        clienteRepo = new ClienteRepo();
    }

    @Test
    void getCliente(){

        // Arrange
        Cliente cliente = new Cliente();
        cliente.setApellido("Salvia");
        cliente.setNombre("Facundo");

        clienteRepo.putCliente(cliente);

        Cliente clienteEsperado = new Cliente();
        clienteEsperado.setApellido("Salvia");
        clienteEsperado.setNombre("Facundo");


        // Act

        Cliente clienteObtenido = clienteRepo.getCliente();



        // Assert
        assertEquals(clienteEsperado,clienteObtenido);
    }
}
