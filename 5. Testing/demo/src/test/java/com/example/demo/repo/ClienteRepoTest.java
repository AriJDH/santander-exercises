package com.example.demo.repo;

import com.example.demo.modelos.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.BeanProperty;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ClienteRepoTest {
    private ClienteRepo clienteRepo;

    @BeforeEach
    void setup(){
        clienteRepo = new ClienteRepo();
    }

    @Test
    void getCliente() {
        //Arrange
        Cliente clienteAGuardar = new Cliente("Juan", "Carlos");

        //Act
        clienteRepo.putCliente(clienteAGuardar);
        Cliente clienteObtenido = clienteRepo.getCliente();

        //Asserts
        assertEquals(clienteAGuardar, clienteObtenido);
    }

    @Test
    void putCliente() {

    }
}