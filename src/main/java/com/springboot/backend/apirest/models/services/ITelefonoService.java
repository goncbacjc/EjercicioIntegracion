package com.springboot.backend.apirest.models.services;

import com.springboot.backend.apirest.models.entity.Cliente;
import com.springboot.backend.apirest.models.entity.Telefono;

import java.util.List;

public interface ITelefonoService {
	
	public List<Telefono> findAll();

	public Telefono save(Telefono telefono);
}
