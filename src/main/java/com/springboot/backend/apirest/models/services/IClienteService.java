package com.springboot.backend.apirest.models.services;

import java.util.List;

import com.springboot.backend.apirest.models.entity.Cliente;
import com.springboot.backend.apirest.models.entity.Telefono;
import org.springframework.transaction.annotation.Transactional;

public interface IClienteService {
	
	public List<Cliente> findAll();

	public Cliente save(Cliente cliente);
}
