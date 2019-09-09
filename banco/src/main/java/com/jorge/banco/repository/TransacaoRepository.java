package com.jorge.banco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jorge.banco.model.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao,Long> {

	 
}
