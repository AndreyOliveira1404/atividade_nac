package com.fiap.microservicos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fiap.microservicos.model.Atividade;

public interface AtividadeRepository extends MongoRepository<Atividade, String> {

}
