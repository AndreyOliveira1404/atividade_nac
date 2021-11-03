package com.fiap.microservicos.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Atividade {

	@Id 
	private String id;
	private String urlGit;
	private String nome;
	private Integer rm;
	private int nmrAtividade;
	
}
