package com.algaworks.adyellen.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.adyellen.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Maria da Silva");
		cliente1.setEmail("maria.silva@email.com");
		cliente1.setTelefone("81 99999-9999");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Joao da Silva");
		cliente2.setEmail("joao.silva@email.com");
		cliente2.setTelefone("81 98888-8888");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
