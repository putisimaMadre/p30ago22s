package com.example.proyecto21082022.service;

import com.example.proyecto21082022.entity.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> clientes();
    Cliente clienteSave(Cliente cliente);
    Cliente clienteById(Long id);
}
