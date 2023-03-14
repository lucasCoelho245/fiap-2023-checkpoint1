package com.github.devcanovas.checkpoint1_api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.devcanovas.checkpoint1_api.dto.EmpregadoDto;
import com.github.devcanovas.checkpoint1_api.model.Empregado;
import com.github.devcanovas.checkpoint1_api.service.EmpregadoService;


@RestController
@RequestMapping("/empregado")
public class EmpregadoController {
    
    @Autowired
    private EmpregadoService service;

    @GetMapping
    public List<Empregado> getAllEmpregados() {
	return service.findAll();
    }
    
    @PostMapping
    public Empregado registerEmpregado(@RequestBody EmpregadoDto dto) {
	return service.save(dto);
    }
    
}
