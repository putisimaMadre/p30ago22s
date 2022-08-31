package com.example.proyecto21082022.controllers;

import com.example.proyecto21082022.entity.Cliente;
import com.example.proyecto21082022.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("cliente")
    public List<Cliente> getCliente(){
        return clienteService.clientes();
    }
}
