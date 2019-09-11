package com.jorge.banco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jorge.banco.model.Extrato;

public interface ExtratoRepository extends JpaRepository<Extrato, Integer> {

	List<Extrato> findByidConta(long idConta);

	List<Extrato> findBytipo(char tipo);

	@Query("select e from Extrato e")
	List<Extrato> findAll();

	/*
	 * @Query(value="select e from Extrato e where e.id_conta = :id_conta") public
	 * List<Extrato> findById(@Param("id_conta") int idConta);
	 */
	/*
	 * @Query(value="select e from Extrato e where e.id_conta = :id_conta") public
	 * List<Extrato> findAll(@Param("id_conta") int id_conta);
	 */

	/*
	 * @Query("select p from Person p where p.forename = ?1.forename and p.surname = ?1.surname"
	 * ) findByName(Name name);
	 */
}
