package com.example.demo.servicios;

import com.example.demo.modelos.Cliente;
import com.example.demo.repo.ClienteRepo;
import com.example.demo.dto.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicio {

    @Autowired
    ClienteRepo clienteRepo;

    public ClienteDto getCliente() {
        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setApellido(clienteRepo.getCliente().getApellido());
        clienteDto.setNombre(clienteRepo.getCliente().getNombre());
        return  clienteDto;
    }

    public void putCliente(ClienteDto clienteDto) {
        Cliente cliente = new Cliente();
        cliente.setNombre(clienteDto.getNombre());
        cliente.setApellido(clienteDto.getApellido());
        clienteRepo.putCliente(cliente);
    }


}
