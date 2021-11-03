package com.fiap.microservicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.microservicos.model.Atividade;

@SpringBootApplication
@RestController
public class NacMicroservicosAtividadeApplication {
	
	@GetMapping("/")
	public String get() {
		Atividade atividade = new Atividade();
		
		atividade.setNome("ANDREY OLIVEIRA");
		
		return "NAC 1 DE MICROSERVICES SEGUNDO SEMESTRE";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(NacMicroservicosAtividadeApplication.class, args);
	}

}
