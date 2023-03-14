package com.github.devcanovas.checkpoint1_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.devcanovas.checkpoint1_api.dto.EmpregadoDto;
import com.github.devcanovas.checkpoint1_api.model.Empregado;
import com.github.devcanovas.checkpoint1_api.repository.EmpregadoRepository;

@Service
public class EmpregadoService {

    @Autowired
    private EmpregadoRepository repository;
    
    public List<Empregado> findAll() {
	return repository.findAll();
    }
    
    public Empregado save(EmpregadoDto dto) {
	return repository.save(Empregado.builder()
		.nome(dto.getNome())
		.endereco(dto.getEndereco())
		.build());
    }
    
    public Empregado update(Empregado empregado) {
	return repository.save(empregado);
    }
    
}
