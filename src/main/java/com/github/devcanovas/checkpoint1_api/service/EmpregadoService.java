package com.github.devcanovas.checkpoint1_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.devcanovas.checkpoint1_api.repository.EmpregadoRepository;

@Service
public class EmpregadoService {

    @Autowired
    private EmpregadoRepository repository;
    
}
