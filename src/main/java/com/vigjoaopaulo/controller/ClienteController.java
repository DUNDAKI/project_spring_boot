package com.vigjoaopaulo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vigjoaopaulo.ClienteRepository;
import com.vigjoaopaulo.model.Cliente;

@RestController
@RequestMapping("/clientes")
@Service
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@GetMapping
	public List<Cliente>  listaAll() {
		 return clienteRepository.findAll();
		
	}
	
	
	@PostMapping
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	

}
