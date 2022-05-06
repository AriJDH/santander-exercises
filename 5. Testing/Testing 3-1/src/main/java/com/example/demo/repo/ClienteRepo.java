package com.example.demo.repo;

import com.example.demo.modelos.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepo {

    private Cliente cliente;

    public ClienteRepo() {
        Cliente cliente = new Cliente();
    }

    public Cliente getCliente() {
        if(this.cliente== null) return new Cliente("Prueba","Datos");
        return this.cliente;
    }

    public void putCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
