package com.github.devcanovas.checkpoint1_api.controller;


import static com.github.devcanovas.checkpoint1_api.constants.UrlConstants.URL_GET_ALL_EMPREGADOS;
import static com.github.devcanovas.checkpoint1_api.constants.UrlConstants.URL_SAVE_EMPREGADO;
import static com.github.devcanovas.checkpoint1_api.constants.UrlConstants.URL_UPDATE_EMPREGADO;
import static org.springframework.http.ResponseEntity.ok;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.devcanovas.checkpoint1_api.dto.EmpregadoDto;
import com.github.devcanovas.checkpoint1_api.model.Empregado;
import com.github.devcanovas.checkpoint1_api.service.EmpregadoService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/empregado")
@Slf4j
public class EmpregadoController {
    
    @Autowired
    private EmpregadoService service;

    @GetMapping(URL_GET_ALL_EMPREGADOS)
    public ResponseEntity<List<Empregado>> getAllEmpregados() {
	log.info("GET | {} | Iniciado | getAllEmpregados()", URL_GET_ALL_EMPREGADOS);
	List<Empregado> empregados = service.findAll();
	log.info("GET | {} | Finalizado | getAllEmpregados() | EmpregadosResponse: {}", URL_GET_ALL_EMPREGADOS, empregados);
	return ok(empregados);
	
    }
    
    @PostMapping(URL_SAVE_EMPREGADO)
    public ResponseEntity<Empregado> saveEmpregado(@RequestBody EmpregadoDto dto) {
	log.info("POST | {} | Iniciado | saveEmpregado() | EmpregadoDto: {}", URL_SAVE_EMPREGADO, dto);
	Empregado empregadoSaved = service.save(dto);
	log.info("POST | {} | Finalizado | saveEmpregado() | EmpregadoResponse: {}", URL_SAVE_EMPREGADO, empregadoSaved);
	return ok(empregadoSaved);
    }
    
    @PutMapping(URL_UPDATE_EMPREGADO)
    public ResponseEntity<Empregado> updateEmpregado(@RequestBody Empregado empregado) {
	log.info("POST | {} | Iniciado | updateEmpregado() | Empregado: {}", URL_UPDATE_EMPREGADO, empregado);
	Empregado empregadoUpdated = service.update(empregado);
	log.info("POST | {} | Finalizado | updateEmpregado() | EmpregadoResponse: {}", URL_UPDATE_EMPREGADO, empregadoUpdated);
	return ok(empregadoUpdated);
    }
    
}
