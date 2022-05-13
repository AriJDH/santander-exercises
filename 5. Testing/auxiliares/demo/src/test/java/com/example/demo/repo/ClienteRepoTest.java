package com.example.demo.repo;

import com.example.demo.modelos.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteRepoTest {

    ClienteRepo clienteRepo;

    @BeforeEach
    void setup(){
        clienteRepo = new ClienteRepo();
    }

    @Test
    void getCliente(){

        Cliente cliente = new Cliente();
        cliente.setApellido("Gomez");
        cliente.setNombre("Pedro");
        clienteRepo.putCliente(cliente);

        Cliente clienteEsperado = new Cliente();
        clienteEsperado.setApellido("Gomez");
        clienteEsperado.setNombre("Pedro");

        Cliente clienteObtenido = clienteRepo.getCliente();

        assertEquals(clienteEsperado, clienteObtenido);

    }

}
