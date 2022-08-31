package com.example.proyecto21082022.service.impl;

import com.example.proyecto21082022.entity.Cliente;
import com.example.proyecto21082022.repository.ClienteRepository;
import com.example.proyecto21082022.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<Cliente> clientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente clienteSave(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente clienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
}
