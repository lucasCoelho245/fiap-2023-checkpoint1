package br.com.fiap.checkpoint1.service;

import java.util.List;

import br.com.fiap.checkpoint1.repositorio.EmpregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.dto.EmpregadoDto;
import br.com.fiap.checkpoint1.model.Empregado;

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
