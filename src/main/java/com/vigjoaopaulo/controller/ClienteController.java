package com.vigjoaopaulo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vigjoaopaulo.model.Cliente;
import com.vigjoaopaulo.repository.ClienteRepository;

@RestController
@RequestMapping
@Service

public class ClienteController {
	private Cliente getCliente;
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@GetMapping("/clientes")
	public List<Cliente>  listaAll() {
		 return clienteRepository.findAll();
		
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente getCliente(@PathVariable Long id) {
		return clienteRepository.findById(id).get();
	}	
	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente addCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping("/clientes/{id}")
	public void deleteCliente(@PathVariable Long id) {
		clienteRepository.deleteById(id);		
	}
	
	
	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente updateCliente(@PathVariable Long id,  @RequestBody Cliente cliente) {
		
		Cliente newObj = clienteRepository.findById(id).get();
		
		newObj.setNome(cliente.getNome());
		
		
		return  clienteRepository.save(newObj);
	
	
	}
	
	
	
	
	 
	
	
	
	
	
	
	
	
	

}
