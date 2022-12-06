package com.example.proyecto21082022.controllers;

import com.example.proyecto21082022.entity.Cliente;
import com.example.proyecto21082022.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200/"})
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente")
    public List<Cliente> getCliente(){
        return clienteService.clientes();
    }

    @PostMapping("/cliente")
    public Cliente saveCliente(@RequestBody Cliente cliente){
        return clienteService.clienteSave(cliente);
    }

    @GetMapping("/cliente/{id}")
    public Cliente getClienteById(@PathVariable Long id){
        return clienteService.clienteById(id);
    }
}
