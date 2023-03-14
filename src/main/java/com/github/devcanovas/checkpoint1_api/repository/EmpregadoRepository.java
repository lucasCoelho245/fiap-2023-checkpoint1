package com.github.devcanovas.checkpoint1_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.devcanovas.checkpoint1_api.model.Empregado;

public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {

}
