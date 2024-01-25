package com.springboot.backend.apirest.models.dao;

import com.springboot.backend.apirest.models.entity.Telefono;
import org.springframework.data.repository.CrudRepository;

public interface ITelefonoDao extends CrudRepository<Telefono, Long>{

}
