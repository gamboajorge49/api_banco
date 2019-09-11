package com.jorge.banco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jorge.banco.model.Transacao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TransacaoRepository extends JpaRepository<Transacao,Long> {

	Transacao findBytipo(char tipo);

}
