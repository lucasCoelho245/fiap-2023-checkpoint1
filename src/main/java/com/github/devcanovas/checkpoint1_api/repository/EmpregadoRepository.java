package com.github.devcanovas.checkpoint1_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.devcanovas.checkpoint1_api.model.Empregado;

@Repository
public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {

}
