package com.example.proyecto21082022.service.impl;

import com.example.proyecto21082022.entity.Cliente;
import com.example.proyecto21082022.repository.ClienteRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ClienteServiceImplTest {

    @Mock
    private ClienteRepository clienteRepository;

    @InjectMocks
    private ClienteServiceImpl clienteService;
    private Cliente cliente;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        cliente = new Cliente();
        cliente.setNombre("Mariel");
        cliente.setApellido("Barragan");
        cliente.setTelefono("3434343434");
    }

    @Test
    void clientes() {
        when(clienteService.clientes()).thenReturn(Arrays.asList(cliente));
        assertNotNull(clienteService.clientes());
    }
}