package com.jorge.banco.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorge.banco.model.Conta;
import com.jorge.banco.repository.ContaRepository;

@RestController
@RequestMapping(value = "/api")
public class ContaResource {

	@Autowired
	ContaRepository contaRepository;

	@GetMapping("/contas")
	public List<Conta> listarBancos() {
		return this.contaRepository.findAll();
	}

	@GetMapping("/conta/{id}")
	public Conta getBancos(@PathVariable(value = "id") long id) {
		return this.contaRepository.findById(id);
	}

}
