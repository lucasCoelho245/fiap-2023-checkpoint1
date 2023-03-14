package com.github.devcanovas.checkpoint1_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.devcanovas.checkpoint1_api.model.Empregado;
import com.github.devcanovas.checkpoint1_api.repository.EmpregadoRepository;

@Service
public class EmpregadoService {

    @Autowired
    private EmpregadoRepository repository;
    
    public List<Empregado> findAll() {
	return repository.findAll();
    }
    
}
