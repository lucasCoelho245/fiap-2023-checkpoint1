package com.github.devcanovas.checkpoint1_api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empregado")
public class Empregado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoEmpregado;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "endereco")
    private String endereco;
    
}
