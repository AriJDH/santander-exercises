package com.example.demo.controllers;

import com.example.demo.dto.ClienteDto;
import com.example.demo.modelos.Cliente;
import com.example.demo.servicios.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ClienteController {

    @Autowired
    ClienteServicio clienteServicio;

    @GetMapping("/api/getcliente")
    public ClienteDto getCliente() {
        return clienteServicio.getCliente();
    }

    @PostMapping("/api/putcliente")
    public void putCliente(@Valid @RequestBody ClienteDto clienteDto) {
        clienteServicio.putCliente(clienteDto);
    }

}
