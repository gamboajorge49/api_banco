package com.jorge.banco.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jorge.banco.model.Extrato;

public interface ExtratoRepository extends JpaRepository<Extrato,Integer> {

	/*@Query(value="select e from Extrato e where e.id_conta = :id_conta")
    public List<Extrato> findAll(@Param("id_conta") int id_conta);*/
	
}
