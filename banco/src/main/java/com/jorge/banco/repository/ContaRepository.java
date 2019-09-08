package com.jorge.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jorge.banco.model.Conta;

public interface ContaRepository extends JpaRepository<Conta,Long> {

	Conta findById(long id);
	
}
