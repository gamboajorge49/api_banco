package com.jorge.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jorge.banco.model.Agencia;

public interface AgenciaRepository extends JpaRepository<Agencia, Long> {
	Agencia findById(long id);
}
