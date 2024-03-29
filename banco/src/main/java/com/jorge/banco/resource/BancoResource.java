package com.jorge.banco.resource;

import java.util.List;

import org.hibernate.exception.GenericJDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jorge.banco.model.Banco;
import com.jorge.banco.repository.BancoRepository;

@RestController
@RequestMapping(value = "/api")
public class BancoResource {

	@Autowired
	BancoRepository bancoRepository;

	@GetMapping("/bancos")
	public List<Banco> listarBancos() {
		return this.bancoRepository.findAll();
	}

	@GetMapping("/banco/{id}")
	public Banco getBancos(@PathVariable(value = "id") long id) {
		return this.bancoRepository.findById(id);
	}
	
	@PostMapping("/banco")
	public String appendBanco(@RequestBody Banco banco) {
		try {
			this.bancoRepository.save(banco);
			return "{\"status\":\"ok\",\"message\":\"cadastrado com sucesso\"}";

		} catch (GenericJDBCException e) {
			return "{\"status\":\"erro\",\"message\":\"" + e.getMessage() + "\"}";
		}

	}

}
