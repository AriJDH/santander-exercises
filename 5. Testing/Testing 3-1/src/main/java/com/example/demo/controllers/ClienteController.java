package com.example.demo.controllers;

import com.example.demo.dto.ClienteDto;
import com.example.demo.modelos.Cliente;
import com.example.demo.servicios.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ClienteController {

    @Autowired
    ClienteServicio clienteServicio;

    @GetMapping("/api/test")
    public String getTest() {
        return "ok";
    }

    @GetMapping("/api/getcliente/")
    public ClienteDto getCliente() {
        return clienteServicio.getCliente();
    }

    @GetMapping("/api/getclientepornombre/{nombre}")
    public ClienteDto getClientePorNombre(@PathVariable String nombre) {
        ClienteDto clienteDto = clienteServicio.getCliente();
        clienteDto.setNombre(nombre);
        return clienteDto;
    }

    @GetMapping("/api/getclientepornombreget")
    public ClienteDto getClientePorNombreGet(@RequestParam String nombre) {
        ClienteDto clienteDto = clienteServicio.getCliente();
        clienteDto.setNombre(nombre);
        return clienteDto;
    }

    @PostMapping("/api/putcliente")
    public void putCliente(@Valid @RequestBody ClienteDto clienteDto) {
        clienteServicio.putCliente(clienteDto);
    }

    @PostMapping("/api/setcliente")
    public ClienteDto setCliente(@Valid @RequestBody ClienteDto clienteDto) {
        clienteServicio.putCliente(clienteDto);
        return clienteDto;
    }

}
