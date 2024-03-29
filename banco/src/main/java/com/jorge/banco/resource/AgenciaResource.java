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
import com.jorge.banco.model.Agencia;
import com.jorge.banco.repository.AgenciaRepository;

@RestController
@RequestMapping(value = "/api")
public class AgenciaResource {
	@Autowired
	AgenciaRepository agenciaRepository;

	@GetMapping("/agencias")
	public List<Agencia> listarAgencias() {
		return this.agenciaRepository.findAll();
	}

	@GetMapping("/agencia/{id}")
	public Agencia getAgencia(@PathVariable(value = "id") long id) {
		return this.agenciaRepository.findById(id);
	}

	@PostMapping("/agencia")
	public String appendAgencia(@RequestBody Agencia agencia) {
		try {
			this.agenciaRepository.save(agencia);
			return "{\"status\":\"ok\",\"message\":\"cadastrado com sucesso\"}";

		} catch (GenericJDBCException e) {
			return "{\"status\":\"erro\",\"message\":\"" + e.getMessage() + "\"}";
		}

	}

}
