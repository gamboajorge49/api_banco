package com.jorge.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jorge.banco.model.Banco;

public interface BancoRepository extends JpaRepository<Banco, Long> {

	Banco findById(long id);
	
}
