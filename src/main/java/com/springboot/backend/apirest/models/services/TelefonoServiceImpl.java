package com.springboot.backend.apirest.models.services;

import com.springboot.backend.apirest.models.dao.ITelefonoDao;
import com.springboot.backend.apirest.models.entity.Telefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TelefonoServiceImpl implements ITelefonoService{

	@Autowired
	private ITelefonoDao telefonoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Telefono> findAll() {
		return (List<Telefono>) telefonoDao.findAll();
	}

	@Override
	@Transactional
	public Telefono save(Telefono telefono) {
		return telefonoDao.save(telefono);
	}

}
